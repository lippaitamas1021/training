package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {

    private static final int MAX_CARGO_WEIGHT = 1999;

    private Vehicle vehicle;


    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + PERSON_AVERAGE_WEIGHT + vehicle.getVehicleWeight();
    }

    public boolean canCarry(Vehicle vehicle) {
        return vehicle.getVehicleWeight() < MAX_CARGO_WEIGHT;
    }

    public boolean load(Vehicle vehicle) {
        if (canCarry(vehicle)) {
            this.vehicle = vehicle;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{car=" + vehicle.toString();
    }
}
