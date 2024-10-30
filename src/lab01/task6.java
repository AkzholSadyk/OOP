package lab01;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  a = input.nextLine();
        String  b = "";
        char c = a.charAt(0);
        char d = a.charAt(a.length()-1);
        if(c==d){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

//        for(int i = a.length()-1;i>=0;i--){
//            b += a.charAt(i);
//        }
//
//        System.out.println(b);
//        if(b.equals(a)){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }

    }
}
