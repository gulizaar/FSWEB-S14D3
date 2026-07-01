package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description,
                         double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> gas engine ignition");
    }

    @Override
    public void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> burning fuel in " + cylinders + " cylinders");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> gas driving");
        runEngine();
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}