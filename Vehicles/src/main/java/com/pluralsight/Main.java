package com.pluralsight;

public class Main {
    public static void main(String[] args) {
//        Moped slowRide = new Moped();
//        slowRide.setColor("Navy Blue");
//        slowRide.setFuelCapacity(6);
//        System.out.println(slowRide.getColor());
//        System.out.println(slowRide.getFuelCapacity());
//
//        Car fastRide = new Car();
//        fastRide.setColor("Black");
//        fastRide.setCargoCapacity(4);
//        fastRide.setNumberOfPassengers(2);
//        System.out.println(fastRide.getColor());
//        System.out.println(fastRide.getCargoCapacity());
//        System.out.println(fastRide.getNumberOfPassengers());

        Moped slowRide = new Moped("Blue", 2, 0, 5, 25, 4, true);
        Car fastRide = new Car("Black", 2, 0, 5, "Turbo",4, true);
        SemiTruck bigRide = new SemiTruck("Red", 2, 2000, 400, 18, "Diesel", 18);
        Hovercraft airRide = new Hovercraft("Yellow", 10, 0, 40, "Turbo", 2);

        System.out.println("Moped color: " + slowRide.getColor() );
        System.out.println("Car color: " + fastRide.getColor());
        System.out.println("Is the car manual? " + fastRide.isManual());


    }
}
