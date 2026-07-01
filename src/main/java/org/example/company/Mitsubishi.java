package org.example.company;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Mitsubishi -> engine starting differently");
        return "the car's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Mitsubishi -> accelerating fast");
        return "the car is accelerating";
    }

    @Override
    public String brake() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Mitsubishi -> braking system engaged");
        return "the car is braking";
    }
}