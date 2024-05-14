public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.setName("Apple");
        System.out.printf("Fruit Name: %s\n",fruit1.getName());

        fruit1.setSeason("Winter");
        System.out.printf("Season: %s\n",fruit1.getSeason());
    }
}
