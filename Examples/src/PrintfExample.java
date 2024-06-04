public class PrintfExample{
    public static void main(String[] args) throws Exception {
        try{
            printMyName(args[0]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }finally {
            System.out.println("Debug Done!");
        }
    }

    static void printMyName(String name){
        System.out.printf("Name: %s\n", name);
    }
}
