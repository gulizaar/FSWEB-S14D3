package org.example.company;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Ford -> V8 engine starting");
        return "the car's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Ford -> accelerating strong");
        return "the car is accelerating";
    }

    @Override
    public String brake() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("Ford -> braking hard");
        return "the car is braking";
    }
}