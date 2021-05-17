package shapes;

public class Square implements Shape {

    int side = 0;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        int area = side * side;
        return area;
    }

    @Override
    public void display() {
        System.out.println("The area of this square is " + calculateArea() + ".");
    }

}
