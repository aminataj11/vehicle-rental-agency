public class Car extends Vehicle {
    
    private int seating;
    
    public Car( int seating, String description, int mpg, String vin) {
        super(description, mpg, vin); // calling constructor
        this.seating = seating;
     }
public int getSeating() {

    return seating;
}

public String toString() {
    return getDescription() + "Car/MPG: " + getMPG() + " Seating: " + getSeating() + " VIN: " + getVin();

    
}
}
