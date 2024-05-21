public class Person {
    String name, address;
    int age;

    public void displayPerson() {
        System.out.println("Name: "+ name + "\nAge: "+ age + "\nAddress: "+ address);
    }

    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.name = "Elon Musk";
        firstPerson.age = 39;
        firstPerson.address = "Mars";

        firstPerson.displayPerson();
    }
}
