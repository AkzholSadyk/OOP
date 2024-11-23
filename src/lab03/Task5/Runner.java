package lab03.Task5;
import lab03.Task4.Employee;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        System.out.println();
        Chocolate[] chocolates = {
                new Chocolate("Snikers" , 150),
                new Chocolate("Kazakhstan" , 200),
                new Chocolate("Kit Kat" , 180)
        };
        System.out.println("---Sort---");
        Sort.bubbleSort(chocolates);
        for(Chocolate chocolate : chocolates) {
            System.out.println(chocolate) ;
        }
        System.out.println("---------------");
        Time[] namazTime_11nov = {
                new Time(17,53,0), //Құптан
                new Time(11,39,0), //Бесін
                new Time(5,19,0),  //Таң
                new Time(14,53,0), //Екінті
                new Time(16,35,0),  //Ақшам
        };
        System.out.println("-----Sort-----");
        Sort.bubbleSort(namazTime_11nov);
        for(Time time : namazTime_11nov) {
            System.out.println(time.toUniversal());
        }
        System.out.println("----Sort----") ;
        Date hireDate = new Date() ;
        Date hireDate1 = new Date(hireDate.getTime() - 864000000L) ;
        Date hireDate2 = new Date(hireDate.getTime() - 1728000000L)  ;
        Employee[] employees = {
                new Employee("Steve Jobs" , 1, 12000 , new Date(17,8,2006) , "Health Kz" ),
                new Employee("Mark Zuckerberg" , 2, 15000 , new Date(10, 10, 2006), "Health KZ"),
                new Employee("Durov" , 3, 20000,new Date(10,11,2007) , "REEC" )
        };
        Sort.bubbleSort(employees);
        for(Employee e : employees) {
            System.out.println(e) ;
        }
    }
}