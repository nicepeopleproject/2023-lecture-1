public class Main{
    public static void main(String[] args) {
        Car bmwX5 = new Car(80.,14.,40., FuelType.FUEL_95_GDRIVE);
        System.out.println(bmwX5.distanceFuelEnough());
        try {
            bmwX5.goTo(1000);
        }catch (Exception e){
            System.out.println("You should fill your car.");
        }
        System.out.println(bmwX5.getCurrentFuelAmount());
    }
}