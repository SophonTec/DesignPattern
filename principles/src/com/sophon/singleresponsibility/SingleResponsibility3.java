package com.sophon.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("Car");
        vehicle2.runAir("Plane");
        vehicle2.runWater("Ship");
    }
}

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " runs on highway.");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " runs on air.");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " runs on water.");
    }
}