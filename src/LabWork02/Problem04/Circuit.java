package LabWork02.Problem04;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    public double getPower() {
        double I = getCurrent();
        double V = getPotentialDiff();
        return V * I;
    }

    public double getCurrent() {
        double V = getPotentialDiff();
        double R = getResistance();
        return V / R;
    }
}

