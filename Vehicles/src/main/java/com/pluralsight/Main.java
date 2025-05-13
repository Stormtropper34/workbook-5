package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Navy Blue");
        slowRide.setFuelCapacity(6);
        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getFuelCapacity());

        Car fastRide = new Car();
        fastRide.setColor("Black");
        fastRide.setCargoCapacity(4);
        fastRide.setNumberOfPassengers(2);
        System.out.println(fastRide.getColor());
        System.out.println(fastRide.getCargoCapacity());
        System.out.println(fastRide.getNumberOfPassengers());
        

    }
}
