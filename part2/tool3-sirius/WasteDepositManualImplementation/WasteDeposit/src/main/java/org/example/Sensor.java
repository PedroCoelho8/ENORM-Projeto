package org.example;

import org.example.implementations.CalcAverage;

public class Sensor {
    private final int id;
    private double lastValue;

    public Sensor(int id) {
        this.id = id;
    }

    public double read() {
        // Simulação de leitura de valor
        lastValue = Math.random() * 100;

//        if (CalcAverage.isOutlier(lastValue, newValue)) {
//            // Se for outlier, mantém o último valor conhecido
//            return lastValue;
//        }
//        // Se não for outlier, atualiza o último valor

        return lastValue;
    }

    public int getId() {
        return id;
    }
}
