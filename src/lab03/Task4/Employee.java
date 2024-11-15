package lab03.Task4;
import java.util.Date;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double annualSalary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", annualSalary=" + annualSalary +
                ", hireDate=" + hireDate +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.annualSalary, annualSalary) == 0 &&
                hireDate.equals(employee.hireDate) &&
                nationalInsuranceNumber.equals(employee.nationalInsuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.annualSalary, other.annualSalary);
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.hireDate = (Date) hireDate.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
