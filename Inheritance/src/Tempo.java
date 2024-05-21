public class Tempo extends Gadi {
    private int batteryCapacity;
    public Tempo(String make, String model, int year, int batteryCapacity) {
        super(make, model, year, "ELECTRIC");
        this.batteryCapacity = batteryCapacity;
    }
    
    @Override
    public void start() {
        System.out.println("Starting Electric Tempo");
    }

    @Override
    public void accelerate() {
        System.out.println("Zoom Zoom");
    }

    public void chargeBattery() {
        System.out.println("Charging....This is Elon Musk");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + "kwh");
    }
}
