package org.conveyor.belt;

import java.util.Random;

public class Sensor {
    private DataMapping dataMapping;

    private String sensorType;
    private Random random;

    public Sensor(String sensorType, DataMapping dataMapping) {
        this.sensorType = sensorType;
        this.dataMapping = dataMapping;
        this.random = new Random();
    }

    public int detectItem() {
        int itemId = random.nextInt(1000) + 1;
        System.out.println(sensorType + " sensor detected item: " + itemId);
        dataMapping.storeData(itemId);
        return itemId;
    }

    public DataMapping getDataMapping() {
        return dataMapping;
    }

    public String getSensorType() {
        return sensorType;
    }
}
