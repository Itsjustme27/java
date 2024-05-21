public class Rectangle {
    float length, width;

    public float area() {
        return length * width;
    }

    public static void main(String[] args) {
        float firsRectangleArea;
        Rectangle firsRectangle = new Rectangle();
        firsRectangle.length = 12.2f;
        firsRectangle.width = 5.5f;

        firsRectangleArea = firsRectangle.area();
        System.out.println("The area of Rectangle is : " + firsRectangleArea);

    } 
}
