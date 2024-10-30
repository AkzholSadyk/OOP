package lab01;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.print('+');
        for(int i=0; i<s.length(); i++){
            System.out.print('-');

        }
        System.out.print("+\n");
        System.out.print("|"+s+"|\n");

        System.out.print('+');
        for(int i=0; i<s.length(); i++){
            System.out.print('-');

        }
        System.out.print("+\n");


    }
}
