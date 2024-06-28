public class MathOperation {

    private static void operate(int x, int y, IMathOperation mathOp) {
        System.out.println(mathOp.operation(x, y));
    }

    public static void main(String[] args) {
        operate(1, 1, (x, y) -> x + y);
    }
}
