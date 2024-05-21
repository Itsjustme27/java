public class Car2 {
    String make;
    int year;
    Car2(String make, int year) {
        this.make = make;
        this.year = year;
    }

    Car2(String make) {
        this.make = make;
        this.year = 0;
    }
    public static void main(String[] args) {
        Car2  gadi = new Car2("Toyota", 2024);
        Car2 duitaGadi = new Car2("MEredes");

        System.out.println("I got a "+ gadi.make + " of " + gadi.year);
        System.out.println("Now i have "+ duitaGadi.make);
    }
}
