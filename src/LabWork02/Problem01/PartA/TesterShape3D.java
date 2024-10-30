package LabWork02.Problem01.PartA;

import java.util.Vector;

public class TesterShape3D {
    public static void main(String[] args) {
        Vector<Shape3D> shapes = new Vector<>();
        shapes.add(new Cylinder(new Shape3D.Oryn(5,10), Shape3D.Tus.BLUE, 4,5));
        shapes.add(new Cube(new Shape3D.Oryn(5,10), Shape3D.Tus.RED, 4));
        shapes.add(new Sphere(new Shape3D.Oryn(5,10), Shape3D.Tus.YELLOW, 4));
        for (Shape3D shape : shapes) {
            shape.volume();
        }
    }
}
