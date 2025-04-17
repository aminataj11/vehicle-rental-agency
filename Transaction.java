public class Transaction {
    private String creditcard_num;
    private String customer_name;
    private String vehicle_type;
    private String rental_period;
    private String miles_driven;
    private String rental_cost;
    
    public Transaction(String creditcard_num, String customer_name, String vehicle_type, String rental_period, String miles_driven, String rental_cost)
{
    this.creditcard_num = creditcard_num;
    this.customer_name = customer_name;
    this.vehicle_type = vehicle_type;
    this.rental_period = rental_period;
    this.miles_driven = miles_driven;
    this.rental_cost = rental_cost;
}

public String getCreditCardNum() {
    return creditcard_num; 

}

public String getCustomerName() {
    return customer_name;
}
 public String getVehicleType() {
    return vehicle_type;
 }
 public String getRentalPeriod() {
    return rental_period;
 }
 public String getMilesDriven() {
    return miles_driven;
 }
 public String getRentalCost() {
    return rental_cost;
 }
 public String toString() {
    return "Customer Name:" + customer_name + "Credit Card #:" + creditcard_num + "Vehicle Type:" + vehicle_type + "Rental Period" + rental_period + " Mileage: " + miles_driven + "Rental Cost" + rental_cost;
 }
}
