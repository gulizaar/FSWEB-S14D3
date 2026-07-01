package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description,
                     double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> hybrid start (electric + fuel)");
    }

    @Override
    public void runEngine() {
        System.out.println(getClass().getSimpleName() +
                " -> hybrid running: " + cylinders + " cylinders + battery " + batterySize);
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> hybrid driving");
        runEngine();
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}