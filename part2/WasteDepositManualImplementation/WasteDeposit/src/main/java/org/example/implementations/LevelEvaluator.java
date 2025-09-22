package org.example.implementations;

import org.example.Condition;
import org.example.DataCore;

public class LevelEvaluator implements Condition {
    private final double yellowThreshold;
    private final double redThreshold;

    public LevelEvaluator(double yellowThreshold, double redThreshold) {
        this.yellowThreshold = yellowThreshold;
        this.redThreshold = redThreshold;
    }

    public String evaluate(DataCore core) {
        double avg = core.average();
        if (avg >= redThreshold) return "Perigo";
        if (avg >= yellowThreshold) return "Alerta";
        return "Normal";
    }
}
