package lab03.Task4;
import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber, double bonus) {
        super(name, annualSalary, hireDate, nationalInsuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public double getBonus() {
        return bonus;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", annualSalary=" + getAnnualSalary() +
                ", hireDate=" + getHireDate() +
                ", nationalInsuranceNumber='" + getNationalInsuranceNumber() + '\'' +
                ", bonus=" + bonus +
                ", team=" + team +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Manager manager = (Manager) obj;
        return Double.compare(manager.bonus, bonus) == 0 &&
                team.equals(manager.team);
    }

    @Override
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            Manager otherManager = (Manager) other;
            int salaryComparison = Double.compare(this.getAnnualSalary(), otherManager.getAnnualSalary());
            if (salaryComparison != 0) {
                return salaryComparison;
            }
            return Double.compare(this.bonus, otherManager.bonus);
        }
        return super.compareTo(other);
    }

    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.team = (Vector<Employee>) team.clone();
        return cloned;
    }
}
