package LabWork02.Problem04;

public class Parallel extends Circuit {
    private Circuit a;
    private Circuit b;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        double Ra = a.getResistance();
        double Rb = b.getResistance();
        return 1 / (1 / Ra + 1 / Rb);
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
