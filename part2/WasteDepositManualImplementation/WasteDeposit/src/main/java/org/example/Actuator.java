package org.example;

import org.example.implementations.LevelEvaluator;
import org.example.implementations.Normalization;
import java.util.List;
import java.util.Map;

public class Actuator {
    private final String name;
    private final List<Sensor> sensors;
    private final DataCore dataCore;
    private final LevelEvaluator evaluator;
    private final Map<String, Action> actions;

    public Actuator(String name, List<Sensor> sensors, DataCore dataCore, LevelEvaluator evaluator, Map<String, Action> actions) {
        this.name = name;
        this.sensors = sensors;
        this.dataCore = dataCore;
        this.evaluator = evaluator;
        this.actions = actions;
    }

    public void runCycle(List<Double> sensorValues) {
        System.out.println("Atuador: " + name);
        for (int i = 0; i < sensorValues.size(); i++) {
            double normalized = Normalization.normalize(sensorValues.get(i));
            System.out.println("Sensor " + sensors.get(i).getId() + " normalized: " + normalized);
            dataCore.store(normalized);
        }

        double avg = dataCore.average();
        System.out.println("Waste Deposit" + " média: " + avg);

        String level = evaluator.evaluate(dataCore);
        System.out.println("Nível avaliado: " + level);

        Action action = actions.get(level);
        if (action != null) {
            action.execute();
        } else {

        }
    }


}

