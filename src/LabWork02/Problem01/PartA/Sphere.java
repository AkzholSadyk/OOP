package LabWork02.Problem01.PartA;

public class Sphere extends Shape3D{
    private double radius;
    public Sphere(Oryn oryn, Tus tus, double radius) {
        super(oryn, tus);
        this.radius = radius;

    }
    @Override
    public void volume(){
        double a = (4/3)*Math.PI * radius * radius * radius;
        System.out.println("the volue of " + tus + " sphere with radius " + radius + " is eqyal to "+ a);
    }
}
