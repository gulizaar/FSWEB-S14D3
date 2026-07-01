package org.example.arge;

public class CarSkeleton {
    String name;
    String description;


    public CarSkeleton(){

    }

    public CarSkeleton(String name,String description) {
        this.name=name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " -> engine starting");

    }
    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> Driving");
        runEngine();
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> Engine is running");
    }
}
