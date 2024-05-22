public class CircleArea {
    public static void main(String[] args) {
        double area;
        Circle circle = new Circle();
        circle.setRadius(11.90);
        area = circle.area();
        System.out.println("The area of the circle is : " + area);
    }
}
