public class Vehicle {
    String color, model;
    int year;

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.color = "Blue";
        car.model = "Mercedes";
        car.year = 2020;

        System.out.println("Color: " + car.color + "\nModel: " + car.model + "\nYear : " + car.year);
    }
}


