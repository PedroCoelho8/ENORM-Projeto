package org.example.implementations;

public class CalcAverage {
    public static boolean isOutlier(double previousValue, double currentValue) {
        return Math.abs(previousValue - currentValue) > 3;
    }
}
