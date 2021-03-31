package inheritanceconstructor.car;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        if (tankCapacity < fuel) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        } else {
            this.fuel = fuel;
        }
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double liter) {
        fuel += liter;
    }

    public void drive(int distance) {
        if ((fuel -= distance / 100.0 * fuelRate) < 0) {
            throw new RuntimeException("Not enough fuel available!");
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }
}
