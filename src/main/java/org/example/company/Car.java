package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;

        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;

        return cylinders == car.cylinders &&
                Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public String startEngine() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("the car is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("the car is braking");
        return "the car is braking";
    }
}