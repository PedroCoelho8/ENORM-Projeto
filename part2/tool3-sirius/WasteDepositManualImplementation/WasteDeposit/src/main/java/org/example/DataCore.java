package org.example;

import java.util.*;

public class DataCore {
    private final List<Double> normalizedValues = new ArrayList<>();

    public void store(double value) {
        normalizedValues.add(value);
    }

    public List<Double> getValues() {
        return normalizedValues;
    }

    public double average() {
        return normalizedValues.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}
