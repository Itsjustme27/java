public class Gadi {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Gadi(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void start() {
        System.out.println("Starting the car");
    }

    public void accelerate() {
        System.out.println("Vroom Vroom");
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);     
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}
