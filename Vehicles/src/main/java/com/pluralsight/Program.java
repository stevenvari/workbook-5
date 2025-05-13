package com.pluralsight;

public class Program {
    public static void main(String[] args) {

        //moped

        Moped moped = new Moped();

        moped.setMaxSpeed(55);
        System.out.println(moped.getMaxSpeed());
        moped.setHelmetStorage(true);
        System.out.println(moped.hasHelmetStorage());

        //vehicle

        Vehicle vehicle = new Vehicle();
        vehicle.setColor("black");
        System.out.println(vehicle.getColor());




    }
}
