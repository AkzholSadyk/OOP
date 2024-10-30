package LAB01against0.task3;

import java.util.*;
public class TestingTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int temp = sc.nextInt();
        Temperature data = new Temperature();
        if(s.equals("C")){
            System.out.println("degreesCelsius:"+ temp);
            System.out.println("degreesFahrenheit:" + data.getFahrenheit(temp));
        }
        else if(s.equals("F")){
            System.out.println("degreesFahrenheit:" + temp);
            System.out.println("degreesCelsius:"+ data.setCelecium(temp));
        }
    }
}
