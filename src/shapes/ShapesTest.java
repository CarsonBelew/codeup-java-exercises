package shapes;


public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5,4);
        Measurable myShape2 = new Square(5);

        System.out.println("Perimeter = " +myShape.getPerimeter());
        System.out.println("Area = " +myShape.getArea());
        System.out.println("Perimeter = " +myShape2.getPerimeter());
        System.out.println("Area = " +myShape2.getArea());
    }
}
