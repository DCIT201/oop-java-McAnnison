
public class Motorcycle extends Vehicle {
    private boolean needsHelmet;//indicates helmet is provided
    private boolean hasInsurance;//indicates there is insurance cover

  //constructor
    public Motorcycle(String vehicleID, String model, double baseRentalRate, boolean needsHelmet, boolean hasInsurance) {
        super(vehicleID, model, baseRentalRate);
        this.needsHelmet = needsHelmet; 
        this.hasInsurance = hasInsurance;
    }

  
    public boolean needsHelmet() { 
        return needsHelmet; 
    }

    public void setNeedsHelmet(boolean needsHelmet) { 
        this.needsHelmet = needsHelmet;
    }

    public boolean hasInsurance() { 
        return hasInsurance;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance; 
    }

    @Override 
    public double calculateRentalCost(int days) { 
        return getBaseRentalRate() * days; // Rental cost calculation
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable(); 
    }

    @Override
    public String toString() {
        return "Motorcycle: " + getModel() + " (ID: " + getVehicleID() + ")";
    }
}
