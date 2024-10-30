package lab02;

public class Student {
    int id = 0;
    static int countOfStudents = 1;
    String name;
    int yearOfStudy;
    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.id = countOfStudents++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void incYearOfStudy() {
        this.yearOfStudy++;
    }
}
