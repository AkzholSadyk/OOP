package lab03.Task4;

import java.util.*;


public class Runner {
    public static void main(String[] args) {
        Vector<Employee> EmployeList = new Vector<>();
        EmployeList.add(new Employee("Employee4", 130, 2500, new Date(10, 20, 2009), "lkvmeb"));
        EmployeList.add(new Employee("Employee1", 148, 5000, new Date(12, 10, 2006), "sldknflag"));
        EmployeList.add(new Employee("Employee2", 150, 10000, new Date(12, 12, 2005), "ldknghq"));
        EmployeList.add(new Employee("Employeee3", 100, 7500, new Date(9, 5, 2007), "dfkgnlav"));
        EmployeList.add(new Manager("Manager1", 130, 2500, new Date(10, 20, 2009), "lkvmeb", 20000));
        EmployeList.add(new Manager("Manager2", 120, 2500, new Date(19, 4, 2010), "vslnrb", 10000));

        Scanner inp =  new Scanner(System.in);
        System.out.println("[1] sort by salary");
        System.out.println("[2] sort by name");
        System.out.println("[3] sort by Date");
        System.out.println("[4] show cloning");
        System.out.println("[other numbers] break");
        int n = inp.nextInt();

        if(n == 1) {
            Collections.sort(EmployeList);
            for(Comparable employee : EmployeList) {
                System.out.println(employee);
                System.out.println("-------------------------\n");
            }
        }
        if(n == 2){
            Comparator nameCamparator = new NameCamparator();
            Collections.sort(EmployeList, nameCamparator);
            for(Comparable employee : EmployeList) {
                System.out.println(employee);
                System.out.println("-------------------------\n");
            }
        }
        if(n == 3){
            Comparator dateCamparator = new DateCamparator();
            Collections.sort(EmployeList, dateCamparator);
            for(Comparable employee : EmployeList) {
                System.out.println(employee);
                System.out.println("-------------------------\n");
            }
        }
        if(n == 4){
            Employee e =  EmployeList.get(0);
            Employee clone = e.clone();
            System.out.println(e);
            System.out.println("------------");
            System.out.println(clone);
        }
    }
}