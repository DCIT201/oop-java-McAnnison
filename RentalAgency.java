import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicleFleet; 
    public RentalAgency() {
        vehicleFleet = new ArrayList<>(); // Initialize the vehicle fleet
    }

    // Method to add a vehicle 
    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    // Get a list of available vehicles for rental
    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> available = new ArrayList<>();
        for (Vehicle vehicle : vehicleFleet) { 
            if (vehicle.isAvailableForRental()) {
                available.add(vehicle);
            }
        }
        return available;
    }

    // Renting a vehicle to a customer
    public void rentVehicle(String vehicleID, Customer customer, int days) { 
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.getVehicleID().equals(vehicleID) && vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false); 
                System.out.println(customer.getName() + " has successfully rented this vehicle.");
                return;
            }
        }
        System.out.println("This vehicle: " + vehicleID + " is not available.");
    }
}
