package LabWork02.Problem04;


public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference;

    public Resistor(double resistance) {
        this.resistance = resistance;
        this.potentialDifference = 0;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }
}
