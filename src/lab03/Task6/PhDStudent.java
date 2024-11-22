package lab03.Task6;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhDStudent implements Person {
    private String name;
    private int age;
    private int level;

    private List<Animal> animals = new ArrayList<>();
    private Map<Animal, Person> petTransferredTo = new HashMap<>();
    private Map<Animal, Person> petReceivedFrom = new HashMap<>();

    public PhDStudent() {
        // Default constructor
    }

    public PhDStudent(String name, int age, int level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    // Unique PhDStudent behavior
    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
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
        return "PhDStudent";
    }

    @Override
    public void assignPet(Animal animal) {
        // PhDStudent cannot own a Dog
        if (animal instanceof Dog) return;
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
        PhDStudent other = (PhDStudent) obj;
        return this.age == other.age &&
                this.level == other.level &&
                this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, level, animals);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animals=" + animals +
                "] PhDStudent[" +
                "level=" + level +
                ']';
    }
}

//
//public class PhDStudent extends Person {
//    private int level;
//
//    public PhDStudent(){}
//
//    public PhDStudent(String name, int age, int level){
//        super(name, age);
//        this.level = level;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//
//    public int getLevel() {
//        return level;
//    }
//
//    @Override
//    public void assignPet(Animal animal) {
//        if (animal instanceof Dog) return;
//        super.assignPet(animal);
//    }
//
//    @Override
//    public String getOccupation() {
//        return "PhdStudent";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (!super.equals(obj)) return false;
//        PhDStudent ps = (PhDStudent) obj;
//        return ps.getLevel() == this.getLevel();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "[PhDStudent{" +
//                "level=" + level +
//                "]]";
//    }
//}