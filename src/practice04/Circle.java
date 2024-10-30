package practice04;

public class Circle extends Shape {
    private int radius;

    public Circle(Position position, Color color, int radius) {
        super(position, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle at (" + position.x + "," + position.y + ") with radius " + radius);
        for (int i = 0; i < radius * 2; i++) {
            for (int j = 0; j < radius * 2; j++) {
                int dx = radius - i;
                int dy = radius - j;
                if ((dx * dx + dy * dy) <= (radius * radius)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
