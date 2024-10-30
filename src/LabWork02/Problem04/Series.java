package LabWork02.Problem04;


public class Series extends Circuit {
    private Circuit a;
    private Circuit b;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff() + b.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        double totalResistance = getResistance();
        double V1 = V * a.getResistance() / totalResistance;
        double V2 = V * b.getResistance() / totalResistance;
        a.applyPotentialDiff(V1);
        b.applyPotentialDiff(V2);
    }
}
