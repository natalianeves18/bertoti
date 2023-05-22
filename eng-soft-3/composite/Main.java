import java.util.ArrayList;
import java.util.List;

interface Shape {
    void draw();
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        CompositeShape group = new CompositeShape();
        group.addShape(circle);
        group.addShape(square);

        Shape circle2 = new Circle();
        Shape square2 = new Square();

        CompositeShape group2 = new CompositeShape();
        group2.addShape(circle2);
        group2.addShape(square2);

        CompositeShape mainGroup = new CompositeShape();
        mainGroup.addShape(group);
        mainGroup.addShape(group2);

        mainGroup.draw();
    }
}