package lab01;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int dd = b*b - 4*a*c;
        double d = Math.sqrt(dd);
        System.out.println(d);
        if(d>0){
            double answer1 = (-b - d)/(2*a);
            double answer2 = (-b + d)/(2*a);
            System.out.println("x1 = "+answer1);
            System.out.println("x2 = "+answer2);
        }
        else{
            System.out.println("error");
        }
    }
}
