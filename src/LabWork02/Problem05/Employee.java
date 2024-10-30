package LabWork02.Problem05;

public class Employee extends Person {
    private Grading grading;

    public Employee(){}

    public Employee(String name, int age, Grading grading){
        super(name, age);
        this.grading = grading;
    }

    public void setGrading(Grading grading) {
        this.grading = grading;
    }

    public Grading getGrading() {
        return grading;
    }

    @Override
    public String getOccupation() {
        return "" + getGrading() + " Employee";
    }

    @Override
    public String toString() {
        return super.toString() + " Employee[" +
                "grading=" + grading +
                ']' + ' ';
    }
}