public class Minivan extends Vehicle {

    private double CargoStorage;
    private int seating; 

    public Minivan (double CargoStorage, String description, int mpg, String vin, int seating){
        super(description, mpg, vin); // calling constructor
        this.CargoStorage = CargoStorage; 
        this.seating = seating;
    }
    public double getCargoStorage() {
        return CargoStorage;
    }
    public int getSeating() {
        return seating;

    }
    public String toString() {
        return getDescription() + " Minivan/MPG: " + getMPG() + " Seating: " + getSeating() + "Cargo Storage: " + getCargoStorage() + "cu. ft " + " VIN: " + getVin();
    }
    
}
