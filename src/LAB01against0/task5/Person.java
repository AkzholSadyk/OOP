package LAB01against0.task5;

public class Person {
    public String name;
    public Gender gender ;

    public Person(String name,Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString() {
        return "Gender: "+gender;
    }
}
