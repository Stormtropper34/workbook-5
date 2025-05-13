package com.pluralsight;

public class Moped extends Vehicle {
    private int numberOfWheels;
    private int engineSize;
    private boolean hasBasket;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfWheels, int engineSize, boolean hasBasket) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfWheels = numberOfWheels;
        this.engineSize = engineSize;
        this.hasBasket = hasBasket;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
}
