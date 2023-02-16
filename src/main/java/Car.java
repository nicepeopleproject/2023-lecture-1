public class Car{
   private double maxFuelAmount;
   private double fuelConsumption;
   private double currentFuelAmount;
   private FuelType fuelType;

    public Car(double maxFuelAmount, double fuelConsumption, double currentFuelAmount, FuelType fuelType) {
        this.maxFuelAmount = maxFuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.currentFuelAmount = currentFuelAmount;
        this.fuelType = fuelType;
    }

    public double distanceFuelEnough(){
        return currentFuelAmount/fuelConsumption * 100.;
    }

    public void goTo(double km){
        if(fuelConsumption/100*km>currentFuelAmount) throw new RuntimeException("Isn't enough fuel.");
        currentFuelAmount -= fuelConsumption/100*km;
    }

    public double getCurrentFuelAmount() {
        return currentFuelAmount;
    }
}
