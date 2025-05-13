package com.pluralsight;

public class Hovercraft extends Vehicle {
    private String propellerType;
    private int passengerCapacity;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String propellerType, int passengerCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.propellerType = propellerType;
        this.passengerCapacity = passengerCapacity;

    }

    public String getPropellerType() {
        return propellerType;
    }

    public void setPropellerType(String propellerType) {
        this.propellerType = propellerType;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }



}
