package Midterm_training.problem01;

import java.util.*;
public class TesterForDorm {
    public static void main(String[] args) {
        Vector<Dormotory> aa = new Vector<>();
        aa.add(new ako("Akzhol","Sadyk", 18, "4A", 1, "FIT"));
        for(Dormotory d : aa){
            d.studentFromDorm();
        }
    }
}
