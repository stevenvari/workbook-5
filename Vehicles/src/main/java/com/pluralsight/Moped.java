package com.pluralsight;

public class Moped extends Vehicle {

    private boolean helmetStorage;
    private int maxSpeed;


    public boolean hasHelmetStorage() {
        return helmetStorage;
    }

    public void setHelmetStorage(boolean helmetStorage) {
        this.helmetStorage = helmetStorage;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
