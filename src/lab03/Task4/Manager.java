package lab03.Task4;
import java.util.*;
public class Manager extends Employee{
    private double bonus = 0;
    Vector<Employee> employees = new Vector<>();

    public Manager(String name, int id, double salary, Date date, String nucNumber, double bonus) {
        super(name, id, salary, date, nucNumber);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void addEmployee(Employee e) {
        employees.add(e);
    }
    public void removeEmployee(Employee e) {
        employees.remove(e);
    }


    public Employee clone(){
        return new Manager(getName(), getID(), getSalary(), getHireDate(), getInsuranceNumber(), getBonus());
    }
    @Override
    public int compareTo(Employee e) {
        int ans = super.compareTo(e);
        if (ans == 0 && e.getClass() == this.getClass()) {
            if(this.getBonus() > ((Manager) e).getBonus())
                ans = 1;
            else if(this.getBonus() < ((Manager) e).getBonus())
                ans = -1;
        }
        return ans;
    }
    @Override
    public String toString(){
        return super.toString() +
                "Bonus:" + getBonus() +
                "\nEmployees:" + employees + '\n';
    }
}
