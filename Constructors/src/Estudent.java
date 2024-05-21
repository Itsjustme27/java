public class Estudent {
    String name;
    int age, roll;
    Estudent(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }


    public static void main(String[] args) {
        Estudent student1 = new Estudent("Bidyarthi", 12, 111);
        Estudent student2 = new Estudent("Yarthibid", 13, 222);

        System.out.println("\nStudent information:\n ");
        System.out.printf("1. \tStudent name: %s\n \tStudent age: %d\n \tStudent roll no.: %d\n\n", student1.name, student1.age, student1.roll);
        System.out.printf("2. \tStudent name: %s\n \tStudent age: %d\n \tStudent roll no.: %d\n", student2.name, student2.age, student2.roll);
    }

}
