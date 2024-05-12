
public class Main {
    public static void main(String[] args){
        Car main = new Car();
        main.color = "Yellow";
        main.brand = "Mercedes";
        main.modelYear = 2024;
        System.out.printf("I have a %s %s of %d model\n", main.color, main.brand, main.modelYear);
        System.out.println(main.getClass());
    }
}

