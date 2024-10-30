package lab01;

import java.util.Scanner;

public class secondtask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a*a;
        int perimetr = a*4;
        double dioganal = a * Math.sqrt(2);
        int ss  = a*a+b*b;
        System.out.println(ss);
        System.out.println("Perimetr: " + perimetr);
        System.out.println("Dioganal: " + dioganal);
        System.out.println("Area: " + area);
    }
}
