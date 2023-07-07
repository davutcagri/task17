import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculater areaCalculater = new AreaCalculater();
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculater);
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        Shape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        int sum = areaCalculater.sum(shapes);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}