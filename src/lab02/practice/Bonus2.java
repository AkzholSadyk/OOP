package lab02.practice;

import java.util.Scanner;


public class Bonus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*a+b*b;
        System.out.println(Math.sqrt(c));
    }
}
