// //encapsulation example

// public class Main2 {
//     public static void main(String[] args){
//         Student student2 = new Student();
//         student2.name = "Sujal";
//         student2.age = 12;
//     }
// }

public class Main2 {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setName("Sujal");
        System.out.printf("Name : %s\n", s1.getName());
        s1.setAge(9);
        System.out.printf("Age: %d\n", s1.getAge());
    }
}
