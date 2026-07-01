package org.example.arge;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description,
                       double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> electric start (silent)");
    }

    @Override
    public void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> battery size " + batterySize);
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> electric driving");
        runEngine();
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}