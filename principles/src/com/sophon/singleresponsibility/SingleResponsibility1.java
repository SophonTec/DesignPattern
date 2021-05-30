package com.sophon.singleresponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("Car");
        vehicle.run("Auto");
        vehicle.run("Plane");
    }

}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " runs on highway.");
    }
}