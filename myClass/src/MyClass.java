

public class MyClass {
    static int classVariable = 20;

    public void myMethod() {
        int localVariable = 10;
        Dog myDog = new Dog();

        System.out.println("Local Variable: " + localVariable);
        System.out.println("Class variable: "+ classVariable);
        System.out.println("Instance variable: "+ myDog.value);
    }
    public static void main(String[] args) throws Exception {
        MyClass myObj = new MyClass();
        myObj.myMethod();
    }
}
