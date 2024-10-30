package Midterm_training.problem01;

public abstract class Dormotory {
    public abstract void studentFromDorm();

    public String name;
    public String surname;
    public int age;

    public Dormotory(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
