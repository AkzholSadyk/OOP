package LabWork02.Problem01.PartA;

public class Cylinder extends Shape3D{
    private double radius, height;
    public Cylinder(Oryn oryn, Tus tus, double radius, double height) {
        super(oryn, tus);
        this.radius = radius;
        this.height = height;
    }
    @Override
    public void volume(){
        double a = Math.PI * radius * radius * height;
        System.out.println("the volue of " + tus + " cylinder with radius " + radius + " and height " + height+ " is eqyal to "+ a);
    }
}
