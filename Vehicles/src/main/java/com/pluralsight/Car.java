package com.pluralsight;

public class Car extends Vehicle {
    private String engineType;
    private int numberOfWheels;
    private boolean isManual;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String engineType, int numberOfWheels, boolean isManual) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.engineType = engineType;
        this.numberOfWheels = numberOfWheels;
        this.isManual = isManual;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }
}
