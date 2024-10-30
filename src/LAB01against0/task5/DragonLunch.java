package LAB01against0.task5;

import java.util.*;

public class DragonLunch {
    private static Vector <Person> launch;
    public static Vector <Person> allKidnap;
    public static int count = 0;
    public Gender gender;

    public DragonLunch() {
        launch = new Vector<Person>();
        allKidnap = new Vector<Person>();
    }

    public void kidnap(Person person) {
        launch.add(person);
        allKidnap.add(person);
        count++;

        Person last ;
        Person secondLast ;

        if(count >= 2) {
            last = launch.get(count-1);
            secondLast = launch.get(count-2);
            if(last.getGender() == Gender.BOY && secondLast.getGender() == Gender.BOY ){
                launch.remove(count-1);
                launch.remove(count-2);
                count-=2;
            }
        }


    }

    public boolean willDragonEatOrNot() {
        return !launch.isEmpty();
    }

    public void allPerson() {
        for(Person p : allKidnap) {
            System.out.println(p);
        }
    }



}
