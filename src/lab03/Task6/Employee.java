package lab03.Task6;

import lab03.Task6.Grading;
import lab03.Task6.Person;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee implements Person {
    private String name;
    private int age;
    private Grading grading;

    private List<Animal> animals = new ArrayList<>();
    private Map<Animal, Person> petTransferredTo = new HashMap<>();
    private Map<Animal, Person> petReceivedFrom = new HashMap<>();

    public Employee() {
        // Default constructor
    }

    public Employee(String name, int age, Grading grading) {
        this.name = name;
        this.age = age;
        this.grading = grading;
    }

    // Grading-specific methods
    public void setGrading(Grading grading) {
        this.grading = grading;
    }

    public Grading getGrading() {
        return grading;
    }

    // Implementations of Person interface methods
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
        return grading + " Employee";
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
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animals=" + animals +
                "] Employee[" +
                "grading=" + grading +
                ']';
    }
}



//public class Employee extends Person {
//    private Grading grading;
//
//    public Employee(){}
//
//    public Employee(String name, int age, Grading grading){
//        super(name, age);
//        this.grading = grading;
//    }
//
//    public void setGrading(Grading grading) {
//        this.grading = grading;
//    }
//
//    public Grading getGrading() {
//        return grading;
//    }
//
//    @Override
//    public String getOccupation() {
//        return "" + getGrading() + " Employee";
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + " Employee[" +
//                "grading=" + grading +
//                ']' + ' ';
//    }
//}
