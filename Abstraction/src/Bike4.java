

abstract class Bike4 {
    abstract void run();
}

class Honda4 extends Bike4 {
    void run(){
        System.out.println("running safely");
    }
        public static void main(String[] args) {
            Bike4 obj = new Honda4();
            obj.run();
        }
}
