package com.sophon.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        LandVehicle landVehicle = new LandVehicle();
        landVehicle.run("Car");
        landVehicle.run("Auto");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("Plane");
    }
}

class LandVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " runs on highway.");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " runs on air.");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " runs on water.");
    }
}