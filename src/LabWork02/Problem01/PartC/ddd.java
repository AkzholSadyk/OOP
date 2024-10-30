package LabWork02.Problem01.PartC;
import java.util.HashSet;
public class ddd {
    public static void main(String[] args) {
        HashSet<PersonWork> unique = new HashSet<>();
        PersonWork a = new PersonWork("Ersultan", 2020);
        PersonWork b = new PersonWork("Akzhol", 2022);
        PersonWork c = new PersonWork("Erasyl", 2012);
        PersonWork d = new PersonWork("Akzhol", 2022);


        unique.add(a);
        unique.add(b);
        unique.add(c);
        unique.add(d);

        for(PersonWork people : unique) {
            System.out.println("Name: "+people.getName()+", year: "+people.getYear());
        }


        PersonWork[] group0 = {a, b};
        PersonWork[] group1 = {c, d};

        PersonWork[][] people = {group0, group1};


        boolean ok = false;
        PersonWork personForFind = new PersonWork("Erasyl", 2012);
        AllCompany aaa = new AllCompany(people);

        for(PersonWork ss : aaa.getPeople()[personForFind.hashCode()]) {
            if(ss.equals(personForFind)) {
                ok = true;
            }
        }

        System.out.println(ok);

    }
}
