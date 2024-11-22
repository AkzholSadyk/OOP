package lab03.Task4;
import java.util.Date;
public class Employee extends Person implements Comparable<Employee>{
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, int ID, double salary, Date hireDate, String insuranceNumber) {
        super(name, ID);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }
    Object adam;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Date getHireDate() {
        return hireDate;
    }
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }



    public Employee clone(){
        return new Employee(getName(), getID(), getSalary(), getHireDate(), getInsuranceNumber());
    }
    public int compareTo(Employee emp) {
        if(this.getSalary() > emp.getSalary()){
            return 1;
        }
        else if(this.getSalary() < emp.getSalary()){
            return -1;
        }
        return 0;
    }
    public boolean equals(Object o) {
        if(o instanceof Employee){
            Employee emp = (Employee)o;
            return o.equals(emp) && this.getHireDate() == emp.getHireDate();
        }
        return false;
    }
    public String toString(){
        return  super.toString() +
                "Salary:" + getSalary() +
                "\nDate:" + hireDate +
                "\nInsurance Number:" + insuranceNumber + '\n';
    }
}
