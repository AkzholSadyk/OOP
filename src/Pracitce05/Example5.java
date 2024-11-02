package Pracitce05;


import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

import java.util.StringTokenizer;
public class Example5 {
    public static void main(String[] args) {
        String a="KBTU+SDU,IT";
        StringTokenizer st=new StringTokenizer(a,",+",true);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}