public class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: oink oink");
    }
    public void sleep() {
        System.out.println("The pig is sleeping");
    }
    public static void main(String[] args) {
        Animal obj = new Pig();
        obj.animalSound();
        obj.sleep();
    }
}
