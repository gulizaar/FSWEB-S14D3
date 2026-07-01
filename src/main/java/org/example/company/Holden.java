package org.example.company;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Holden -> engine start sequence");
        return "the car's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Holden -> accelerating smooth");
        return "the car is accelerating";
    }

    @Override
    public String brake() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Holden -> braking controlled");
        return "the car is braking";
    }
}