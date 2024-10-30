package practice04;



public abstract class Shape {
    protected Position position;
    protected Color color;

    public Shape(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public abstract void draw();

    public enum Color {
        BLACK, RED, GREEN, YELLOW, BLUE, WHITE
    }

    public static class Position{
        public int x;
        public int y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
