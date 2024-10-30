package practice04;


import java.util.*;

public class A {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();
        shapes.add(new Circle(new Shape.Position(5,10), Shape.Color.BLUE, 4));
        shapes.add(new Triangle(new Shape.Position(50, 60), Shape.Color.BLUE, 5, 6));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
