package shapes;

public class Triangle implements Shape {

    int base = 0;
    int height = 0;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        int area = (int) ((base * height) / 2);
        return area;
    }

    @Override
    public void display() {
        System.out.println("The area of this triangle is " + calculateArea() + ".");
    }
}
