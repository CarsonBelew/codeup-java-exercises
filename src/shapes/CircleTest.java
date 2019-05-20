package shapes;
import util.Input;



public class CircleTest {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        System.out.println("The area is: "+circle.getArea());
        System.out.println("The circumference is: "+circle.getCircumference());
    }
}
