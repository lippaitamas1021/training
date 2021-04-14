package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = 100_000;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() >= boat.getMaxPassengers()) {
            throw new IllegalArgumentException("No more free place");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().getMultiplier() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        } throw new IllegalArgumentException("Passenger not found");
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> orderedList = new ArrayList<>();
        for (Passenger passenger : passengers) {
            orderedList.add(passenger.getName());
        }
        Collections.sort(orderedList);
        return orderedList;
    }

    public double sumAllBookingsCharged() {
        double sum = 0;
        for (Passenger passenger : passengers) {
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result = new HashMap<>();
        for (Passenger passenger : passengers) {
            if (result.containsKey(passenger.getCruiseClass())) {
                result.put(passenger.getCruiseClass(), result.get(passenger.getCruiseClass()) + 1);
            } else {
                result.put(passenger.getCruiseClass(), 1);
            }
        }
        return result;
    }
}
