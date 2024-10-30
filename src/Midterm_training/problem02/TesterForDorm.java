package Midterm_training.problem02;
import LabWork02.Problem01.PartC.PersonWork;

import java.util.*;
public class TesterForDorm {
    public static void main(String[] args) {
        HashSet<Dorm> unique = new HashSet<>();
        Dorm a = new Dorm("Ersultan", 4);
        Dorm b = new Dorm("Ersultan", 4);
        Dorm c = new Dorm("Akzhol", 4);
        Dorm d = new Dorm("Eraha", 4);


        unique.add(a);
        unique.add(b);
        unique.add(c);
        unique.add(d);
        for(Dorm dorm : unique){
            System.out.println("Name: " + dorm.getName() +" Room: " + dorm.getRoom());
        }

        Dorm[] group0 = {a, b};
        Dorm[] group1 = {c, d};

        Dorm[][] dorms = {group0, group1};
        boolean ok = false;
        Dorm student_For_find = new Dorm("Ersultan", 4);
        AllDorm ee = new AllDorm(dorms);

        for(Dorm ss : ee.getDorms()[student_For_find.hashCode()]){
            if(ss.equals(student_For_find)){
                ok = true;
            }
        }

        System.out.println(ok);
    }
}
