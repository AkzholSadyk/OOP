package lab03.Task4;

import java.util.Date;
import java.util.Vector;

public class Runner {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 50000, new Date(), "NI12345");
        Employee emp2 = new Employee("Jane Smith", 60000, new Date(), "NI67890");
        Manager mgr1 = new Manager("Alice Johnson", 70000, new Date(), "NI11223", 5000);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(mgr1);

        System.out.println(emp1.equals(emp2));
        System.out.println(mgr1.equals(emp1));

        System.out.println(emp1.compareTo(emp2));
        System.out.println(mgr1.compareTo(emp1));

        EmployeeNameComparator nameComparator = new EmployeeNameComparator();
        EmployeeHireDateComparator hireDateComparator = new EmployeeHireDateComparator();

        System.out.println(nameComparator.compare(emp1, emp2));
        System.out.println(hireDateComparator.compare(emp1, emp2));

        Employee emp1Clone = emp1.clone();
        Manager mgr1Clone = mgr1.clone();

        System.out.println(emp1Clone);
        System.out.println(mgr1Clone);
    }

}

