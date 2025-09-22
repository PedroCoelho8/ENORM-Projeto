package org.example;

import org.example.implementations.HornAction;
import org.example.implementations.LevelEvaluator;
import org.example.implementations.LightAction;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Sensor> sensors = List.of(new Sensor(1), new Sensor(2), new Sensor(3));
        DataCore coreLuz = new DataCore();
        DataCore coreHorn = new DataCore();

        double yellowThreshold = 0;
        double redThreshold = 1;

        Actuator luzes = new Actuator(
                "Luzes",
                sensors,
                coreLuz,
                new LevelEvaluator(yellowThreshold, redThreshold),
                Map.of(
                        "Normal", new LightAction("Verde"),
                        "Alerta", new LightAction("Amarelo"),
                        "Perigo", new LightAction("Vermelho")
                )
        );

        Actuator horn = new Actuator(
                "Horn",
                sensors,
                coreHorn,
                new LevelEvaluator(yellowThreshold, redThreshold),
                Map.of(
                        "Perigo", new HornAction()
                )
        );

        for (int i = 0; i < 5; i++) {
            System.out.println("--- CICLO " + (i + 1) + " ---");

            // Ler sensores apenas uma vez
            List<Double> sensorValues = sensors.stream()
                    .map(Sensor::read)
                    .toList();

            // Rodar ciclo passando os valores já lidos
            luzes.runCycle(sensorValues);
            horn.runCycle(sensorValues);

            System.out.println();
        }


    }
}
