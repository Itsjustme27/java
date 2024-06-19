public class ExceptionExample {

    public static int divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Don't do zat, dont divide by zero!");
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Lets divide by zero.....");
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch(ArithmeticException err) {
            System.out.println("Caught Arithmetic Exception: " + err.getMessage());
        } finally  {
            System.out.println("Try Again!");
        }
    }
}