public class TestFruit {
    public static void main(String[] args) {
        Fruit2 fruit1 = new Fruit2();
        fruit1.setName("Apple");
        System.out.printf("Fruit Name: %s\n",fruit1.getName());

        fruit1.setSeason("Winter");
        System.out.printf("Season: %s\n",fruit1.getSeason());
    }
}
