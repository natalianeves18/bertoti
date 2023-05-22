import java.util.ArrayList;
import java.util.List;

class CompositeShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void draw() {
        System.out.println("Desenhando um grupo de formas...");

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
