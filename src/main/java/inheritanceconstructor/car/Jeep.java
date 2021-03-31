package inheritanceconstructor.car;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void modifyFuelAmount(double liter) {
        super.modifyFuelAmount(liter);
    }

    @Override
    public void drive(int distance) {
        super.drive(distance);
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + (extraCapacity - extraFuel);
    }

    @Override
    public double getFuel() {
        return super.getFuel() + extraFuel;
    }
}
