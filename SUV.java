public class SUV extends Vehicle {
    private double CargoStorage;
    private int seating; 

    public SUV(double CargoStorage, String description, int mpg, String vin, int seating){
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
        return getDescription() + " SUV/MPG: " + getMPG() + " Seating: " + getSeating() + "Cargo Storage: " + getCargoStorage() + "cu. ft " + " VIN: " + getVin();
    }
}
