package LabWork02.Problem01.PartA;

public class Cube extends Shape3D {
    private double height;
    public Cube(Oryn oryn, Tus tus, double height) {
        super(oryn, tus);
        this.height = height;
    }
    @Override
    public void volume(){
        double a = height*height*height;
        System.out.println("the volue of " + tus + " cube with height " + height+ " is eqyal to "+ a);
    }
}
