//Encapsulation example

// public class Student {
//     private String name;
//     private int age;
// }

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {  //Validation
            this.age = age; 
        }else{
            System.out.println("You aint born yet");
        }   
    }
}

