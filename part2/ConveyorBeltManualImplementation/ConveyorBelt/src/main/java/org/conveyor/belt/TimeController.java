package org.conveyor.belt;

public class TimeController {
    private int beltRunningTime;
    private static int minimumTimePeriod = 30;
    private static int warningTimePeriod = 50;
    private static int maximumTimePeriod = 60;
    public static String WARNINGMESSAGE = "The conveyor belt is gonna stop in 10 seconds";
    public static String STOPMESSAGE = "The conveyor belt is gonna stop";

    private boolean stoppageActive = false;
    private int stoppageCounter = 0;
    private boolean noMoreEntriesAllowed = false;
    private boolean minimumPeriodCompleted = false;

    public TimeController() {
        this.beltRunningTime = 0;
    }

    public void incrementRunningTime() {
        if (!stoppageActive) {
            beltRunningTime++;
        }
    }

    public String checkTimeStatus() {
        if (!noMoreEntriesAllowed) {
            if (beltRunningTime >= maximumTimePeriod) {
                return STOPMESSAGE;
            } else if (beltRunningTime >= warningTimePeriod) {
                return WARNINGMESSAGE;
            }
        }
        return "NORMAL";
    }

    public boolean shouldShowWarning() {
        return checkTimeStatus().equals(WARNINGMESSAGE);
    }

    public boolean shouldStop() {
        return checkTimeStatus().equals(STOPMESSAGE);
    }

    public boolean isStoppageActive() {
        return stoppageActive;
    }

    public void startStoppage() {
        if (!stoppageActive) {
            stoppageActive = true;
            stoppageCounter = 0;
        }
    }

    public boolean processStoppage() {
        if (stoppageActive) {
            stoppageCounter++;
            if (stoppageCounter >= 5) {
                // End stoppage
                stoppageActive = false;
                noMoreEntriesAllowed = true;
                beltRunningTime = 0; // Reset running time counter
                return true; // Stoppage completed
            }
        }
        return false; // Stoppage still active
    }

    public int getStoppageCounter() {
        return stoppageCounter;
    }

    public boolean isMinimumPeriodComplete(boolean beltIsEmpty) {
        if (noMoreEntriesAllowed && beltRunningTime >= minimumTimePeriod && beltIsEmpty) {
            if (!minimumPeriodCompleted) {
                minimumPeriodCompleted = true;
                return true; // Just completed
            }
        }
        return false;
    }

    public boolean isSystemShutdown() {
        return minimumPeriodCompleted;
    }

    public int getBeltRunningTime() {
        return beltRunningTime;
    }

    public void resetTimer() {
        beltRunningTime = 0;
        stoppageActive = false;
        stoppageCounter = 0;
        noMoreEntriesAllowed = false;
        minimumPeriodCompleted = false;
    }

    // Keep the original method for backward compatibility with other parts
    public long getElapsedTime() {
        return beltRunningTime;
    }
}