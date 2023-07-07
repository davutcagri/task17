import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculater areaCalculater;

    public ShapesPrinter(IAreaCalculater areaCalculater) {
        this.areaCalculater = areaCalculater;
    }

    public String json(List<Shape> shapes) {
        return "{sum: %s}".formatted(areaCalculater.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum, %s".formatted(areaCalculater.sum(shapes));
    }
}
