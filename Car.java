public class Car extends Vehicle {
    private boolean hasGPS; // Indicates if the car has GPS
    private boolean hasAirConditioning; // Indicates if the car has air conditioning
    private boolean hasSpareTire; // Indicates if the car has a spare tire

    // Constructor to initialize the details
    public Car(String vehicleID, String model, double baseRentalRate, boolean hasGPS, boolean hasAirConditioning, boolean hasSpareTire) {
        super(vehicleID, model, baseRentalRate);
        this.hasGPS = hasGPS;
        this.hasAirConditioning = hasAirConditioning; 
        this.hasSpareTire = hasSpareTire; 
    }

    // Getters and setters
    public boolean hasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public boolean hasAirConditioning() { 
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning; 
    }

    public boolean hasSpareTire() { 
        return hasSpareTire;
    }

    public void setHasSpareTire(boolean hasSpareTire) { 
        this.hasSpareTire = hasSpareTire; 
    }

    // Method to rent a car
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println(getModel() + " has been rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("The car you are asking for is not available for rental.");
        }
    }

    // To check if a car has been returned
    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println(getModel() + " has been returned.");
    }

    // Calculate rental cost with extra charges for GPS, air conditioning, and spare tire
    @Override
    public double calculateRentalCost(int days) {
        double totalCost = getBaseRentalRate() * days; 
        if (hasGPS) {
            totalCost += 10 * days; 
        }
        if (hasAirConditioning) {
            totalCost += 15 * days; 
        }
        if (hasSpareTire) {
            totalCost += 5 * days; 
        }
        return totalCost; 
    }

    // To check if car is available for rent
    @Override
    public boolean isAvailableForRental() {
        return true; 
    }
}
