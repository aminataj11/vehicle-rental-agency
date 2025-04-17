public class CurrentRates {
    private VehicleRates[] rates = new VehicleRates[3];

    public CurrentRates(VehicleRates CarRates, VehicleRates SUVRates, VehicleRates MinivanRates) {
        rates[1] = CarRates;
        rates [2] = SUVRates;
        rates[3] = MinivanRates;
    }

    public VehicleRates getCarRates() {
        return rates[1];

    }
 public VehicleRates getSUVRates() {
    return rates[2];
 }
 public VehicleRates getMinivanRates() {
    return rates[3];
 }
 public void setCarRates(VehicleRates r) {
    rates[1] = r;
 }
 public void setSUVRates(VehicleRates r) {
    rates[2] = r;
}
public void setMinivanRates(VehicleRates r) {
   rates[3] = r;
}
}
