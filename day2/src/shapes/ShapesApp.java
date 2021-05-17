package shapes;

public class ShapesApp {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Square square1 = new Square(5);
        Triangle triangle1 = new Triangle(5,4);

        circle1.display();
        square1.display();
        triangle1.display();
    }
}
