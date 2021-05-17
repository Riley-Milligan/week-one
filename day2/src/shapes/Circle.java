package shapes;

public class Circle implements Shape {

    int radius = 0;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        int area = (int) ((radius * radius) * 3.14);
        return area;
    }

    @Override
    public void display() {
        System.out.println("The area of this circle is " + calculateArea() + ".");
    }
}
