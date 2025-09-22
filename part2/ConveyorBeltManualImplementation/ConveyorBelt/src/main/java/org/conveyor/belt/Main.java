package org.conveyor.belt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    private static class Person {
        private int entrySecond;
        private int travelTime;
        private int id;
        private int pausedTime; // Track time spent paused

        public Person(int entrySecond, int travelTime, int id) {
            this.entrySecond = entrySecond;
            this.travelTime = travelTime;
            this.id = id;
            this.pausedTime = 0;
        }

        public int getEntrySecond() { return entrySecond; }
        public int getTravelTime() { return travelTime; }
        public int getId() { return id; }
        public int getPausedTime() { return pausedTime; }
        public void addPausedTime(int seconds) { this.pausedTime += seconds; }
        public int getExitSecond() { return entrySecond + travelTime + pausedTime; }
    }

    public static void main(String[] args) {
        ConveyorBeltMain conveyorSystem = new ConveyorBeltMain("BELT-001");
        Random random = new Random();
        ArrayList<Person> peopleOnBelt = new ArrayList<>();

        int personCounter = 0;

        // Pre-calculate when people will enter - ensuring coverage from second 6 to 63
        ArrayList<Integer> entryTimes = generateEntryTimes(random);

        for (int currentSecond = 1; currentSecond <= 120; currentSecond++) {
            System.out.println("\n" + repeatString("=", 50));
            System.out.println("CYCLE " + currentSecond);
            System.out.println(repeatString("=", 50));

            // Handle first 5 seconds - system stopped
            if (currentSecond <= 5) {
                System.out.println(">>> CONVEYOR BELT SYSTEM STOPPED <<<");
                System.out.println("System Status: STOPPED - Startup sequence in progress");
                System.out.println("Belt Movement: HALTED");
                System.out.println("Startup countdown: " + (6 - currentSecond) + " seconds remaining");
                continue;
            }

            // Start system at second 6
            conveyorSystem.startSystem(currentSecond);

            // Process time controller events (warnings, stoppages)
            conveyorSystem.processTimeControllerEvents();

            // Handle stoppage processing
            boolean stoppageCompleted = conveyorSystem.processStoppage();
            if (conveyorSystem.isBeltStopped()) {
                // During stoppage, add paused time to all people on belt
                for (Person person : peopleOnBelt) {
                    person.addPausedTime(1);
                }

                // Show belt status during stoppage and continue to next cycle
                if (!stoppageCompleted) {
                    showBeltStatus(conveyorSystem, peopleOnBelt, currentSecond);
                    continue;
                }
            }

            // Add new person if scheduled and allowed
            if (entryTimes.contains(currentSecond) && conveyorSystem.canAddNewPerson()) {
                Person newPerson = createNewPerson(currentSecond, random, ++personCounter);
                peopleOnBelt.add(newPerson);

                conveyorSystem.getEntryDevice().getSensor().getDataMapping().storeData(1);

                // Start TimeController when first person enters
                if (!conveyorSystem.isFirstPersonEntered()) {
                    conveyorSystem.startTimeController();
                }

                printPersonEntryInfo(newPerson, currentSecond);
            }

            // Check for people exiting (only if belt is not stopped)
            if (!conveyorSystem.isBeltStopped()) {
                processPersonExits(peopleOnBelt, conveyorSystem, currentSecond);
            }

            // Show current belt status
            showBeltStatus(conveyorSystem, peopleOnBelt, currentSecond);

            // Check if minimum period is completed and system should shutdown
            boolean beltIsEmpty = peopleOnBelt.isEmpty();
            conveyorSystem.checkMinimumPeriod(beltIsEmpty);

            // Show system status
            conveyorSystem.printSystemStatus(currentSecond);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        printFinalStatistics(conveyorSystem);
    }

    private static ArrayList<Integer> generateEntryTimes(Random random) {
        ArrayList<Integer> entryTimes = new ArrayList<>();
        entryTimes.add(6);  // First person at 6 seconds

        // Calculate entry times to ensure at least 1 person is always on belt until 63s
        int lastEntryTime = 6;
        while (lastEntryTime < 63) {
            // Add next person within 3-8 seconds to ensure continuous coverage
            int nextGap = 3 + random.nextInt(6); // 3-8 seconds gap
            lastEntryTime += nextGap;
            if (lastEntryTime <= 63) {
                entryTimes.add(lastEntryTime);
            }
        }

        // Ensure we have an entry at exactly 63 seconds (latest entry)
        if (!entryTimes.contains(63)) {
            entryTimes.add(63);
        }

        return entryTimes;
    }

    private static Person createNewPerson(int currentSecond, Random random, int personCounter) {
        int travelTime = 5 + random.nextInt(6); // 5-10 seconds
        return new Person(currentSecond, travelTime, personCounter);
    }

    private static void printPersonEntryInfo(Person person, int currentSecond) {
        System.out.println(">>> NEW PERSON ENTERED <<<");
        System.out.println("Person ID: P" + String.format("%03d", person.getId()));
        System.out.println("Entry Time: " + currentSecond + "s");
        System.out.println("Expected Travel Time: " + person.getTravelTime() + "s");
        System.out.println("Expected Exit Time: " + person.getExitSecond() + "s");
    }

    private static void processPersonExits(ArrayList<Person> peopleOnBelt, ConveyorBeltMain conveyorSystem, int currentSecond) {
        Iterator<Person> iterator = peopleOnBelt.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (currentSecond >= person.getExitSecond()) {
                // Person exits
                conveyorSystem.getExitDevice().getSensor().getDataMapping().storeData(0);

                System.out.println(">>> PERSON EXITED <<<");
                System.out.println("Person ID: P" + String.format("%03d", person.getId()));
                System.out.println("Exit Time: " + currentSecond + "s");
                System.out.println("Actual Travel Time: " + (currentSecond - person.getEntrySecond()) + "s");
                if (person.getPausedTime() > 0) {
                    System.out.println("Time spent paused: " + person.getPausedTime() + "s");
                }

                iterator.remove();
            }
        }
    }

    private static void showBeltStatus(ConveyorBeltMain conveyorSystem, ArrayList<Person> peopleOnBelt, int currentSecond) {
        int totalEntries = conveyorSystem.getEntryDevice().getSensor().getDataMapping().getCount();
        int totalExits = conveyorSystem.getExitDevice().getSensor().getDataMapping().getCount();
        int peopleOnBeltCount = totalEntries - totalExits;

        System.out.println("--- BELT STATUS ---");
        System.out.println("People on belt: " + peopleOnBeltCount);
        System.out.println("Total entries: " + totalEntries);
        System.out.println("Total exits: " + totalExits);
        System.out.println("Current simulation time: " + currentSecond + "s");

        if (conveyorSystem.isFirstPersonEntered()) {
            System.out.println("Belt running time: " + conveyorSystem.getSystemTimeController().getBeltRunningTime() + "s (Warning: 50s, Stop: 60s)");
        }

        if (peopleOnBeltCount > 0) {
            System.out.println("People in transit:");
            for (Person person : peopleOnBelt) {
                int remainingTime = person.getExitSecond() - currentSecond;
                System.out.println("  P" + String.format("%03d", person.getId()) +
                        " - " + remainingTime + "s remaining" +
                        (person.getPausedTime() > 0 ? " (paused: " + person.getPausedTime() + "s)" : ""));
            }
        }
    }

    private static void printFinalStatistics(ConveyorBeltMain conveyorSystem) {
        System.out.println("\n" + repeatString("=", 60));
        System.out.println("SIMULATION COMPLETED");
        System.out.println(repeatString("=", 60));
        System.out.println("=== FINAL STATISTICS ===");
        System.out.println("Total simulation time: 120 seconds");
        System.out.println("System startup delay: 5 seconds");
        System.out.println("Active operation period: " + (120 - 5) + " seconds");
        System.out.println("First person entry: 6 seconds");
        System.out.println("Last person entry: 63 seconds");
        conveyorSystem.printSystemSummary();
    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}