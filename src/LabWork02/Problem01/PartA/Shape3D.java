package LabWork02.Problem01.PartA;



public abstract class Shape3D {
    public abstract void volume();
    //public abstract void surface_area();

    protected Oryn oryn;
    protected Tus tus;

    public Shape3D(Oryn oryn, Tus tus) {
        this.oryn = oryn;
        this.tus = tus;
    }

    public enum Tus {
        BLACK, RED, GREEN, YELLOW, BLUE, WHITE
    }
    public static class Oryn{
        public int x;
        public int y;
        public Oryn(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }


}
