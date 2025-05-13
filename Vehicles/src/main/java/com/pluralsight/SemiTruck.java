package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int numberOfWheels;
    private String engineType;
    private int gear;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfWheels, String engineType, int gear) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfWheels = numberOfWheels;
        this.engineType = engineType;
        this.gear = gear;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
