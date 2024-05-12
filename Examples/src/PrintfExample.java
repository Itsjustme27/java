public class PrintfExample{
    public static void main(String[] args) throws Exception {
        printMyName(args[0]);
    }

    static void printMyName(String name){
        System.out.printf("Name: %s\n", name);
    }
}
