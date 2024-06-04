public class App {
    public static void main(String[] args) {
        int sum , multi;
        Test1 compilePolyTest = new Test1();
        sum = compilePolyTest.show(1, 1);
        multi = compilePolyTest.show(2, 2, 2);
        System.out.println(sum);
        System.out.println(multi);
    }
}
