package practice04;

public class Triangle extends Shape{
    private int b;
    private int h;
    public Triangle(Position position, Color color,int b, int h) {
        super(position, color);
        this.b = b;
        this.h = h;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " triangle at (" + position.x + "," + position.y + ") with base " + b + " and height " + h);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i * b / h; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
