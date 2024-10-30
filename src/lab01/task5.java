package lab01;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a+((a*b)/100);
        System.out.println(c);
    }
}
