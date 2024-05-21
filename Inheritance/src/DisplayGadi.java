public class DisplayGadi {
    public static void main(String[] args) {
        Gadi myGadi = new Gadi("Toyota", "Corolla", 2020, "Gasoline");
        Tempo hariyoBanTempo = new Tempo("Hariyo Ban", "Nepali", 2000, 900);
        
        myGadi.start();
        myGadi.accelerate();
        myGadi.displayInfo();

        hariyoBanTempo.start();
        hariyoBanTempo.accelerate();
        hariyoBanTempo.displayInfo();
        hariyoBanTempo.chargeBattery();
    }
}
