package lab03.Task6;

import lab03.Task6.Degree;
import lab03.Task6.Person;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Person {
    private String name;
    private int age;
    private Degree degree;

    private List<Animal> animals = new ArrayList<>();
    private Map<Animal, Person> petTransferredTo = new HashMap<>();
    private Map<Animal, Person> petReceivedFrom = new HashMap<>();

    public Student() {}

    public Student(String name, int age, Degree degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    // Getter and Setter for degree
    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    // Implementing methods from the Person interface
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getOccupation() {
        return getDegree() + " Student";
    }

    @Override
    public void assignPet(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void removePet(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public boolean hasPet(Animal animal) {
        return animals.contains(animal);
    }

    @Override
    public boolean hasPets() {
        return !animals.isEmpty();
    }

    @Override
    public void leavePetWith(Animal animal, Person person) {
        if (animals.contains(animal)) {
            animals.remove(animal);
            person.assignPet(animal);
            petTransferredTo.put(animal, person);
        }
    }

    @Override
    public void retrievePetFrom(Animal animal, Person person) {
        if (person.hasPet(animal)) {
            person.removePet(animal);
            assignPet(animal);
            petReceivedFrom.put(animal, person);
        }
    }

    @Override
    public Person getWhoReceivedPet(Animal animal) {
        return petTransferredTo.get(animal);
    }

    @Override
    public Person getWhoGavePet(Animal animal) {
        return petReceivedFrom.get(animal);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.age == other.age &&
                this.degree == other.degree &&
                this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, degree, animals);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animals=" + animals +
                "] Student[" +
                "degree=" + degree +
                ']';
    }
}



//public class Student extends Person {
//    private Degree degree;
//
//    public Student(){}
//
//    public Student(String name, int age, Degree degree){
//        super(name, age);
//        this.degree = degree;
//    }
//
//    public void setDegree(Degree degree) {
//        this.degree = degree;
//    }
//
//    public Degree getDegree() {
//        return degree;
//    }
//
//    @Override
//    public String getOccupation() {
//        return getDegree() + " Student";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (!super.equals(obj)) return false;
//        lab03.Task6.Student s = (lab03.Task6.Student) obj;
//        return s.degree == this.degree;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "[Student[" +
//                "degree=" + degree +
//                "]]";
//    }
//}