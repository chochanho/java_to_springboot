package Rectangle;

public class RectangleMain {
    static void main() {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 2;
        rectangle.height = 2;
        rectangle.isSquare();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
