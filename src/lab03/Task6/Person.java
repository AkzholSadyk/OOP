package lab03.Task6;



import java.util.Objects;

public interface Person {

    void setName(String name);
    String getName();

    void setAge(int age);
    int getAge();


    String getOccupation();


    void assignPet(Animal animal);
    void removePet(Animal animal);
    boolean hasPet(Animal animal);
    boolean hasPets();


    void leavePetWith(Animal animal, Person person);
    void retrievePetFrom(Animal animal, Person person);


    Person getWhoReceivedPet(Animal animal);
    Person getWhoGavePet(Animal animal);



    static boolean equals(Person p1, Person p2) {
        if (p1 == p2) return true;
        if (p1 == null || p2 == null) return false;
        return p1.getName().equals(p2.getName()) && p1.getAge() == p2.getAge();
    }


    static int hashCode(Person person) {
        return Objects.hash(person.getName(), person.getAge());
    }


    static String toString(Person person) {
        return "Person[" +
                "name='" + person.getName() + '\'' +
                ", age=" + person.getAge() +
                ']';
    }
}



//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Objects;
//
//public abstract class Person {
//    private String name;
//    private int age;
//    private List<Animal> animals;
//
//    private HashMap<Animal, Person> petTransferredTo;
//    private HashMap<Animal, Person> petReceivedFrom;
//
//    {
//        animals = new ArrayList<>();
//        petTransferredTo = new HashMap<>();
//        petReceivedFrom = new HashMap<>();
//    }
//
//    public Person(){}
//
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public void assignPet(Animal animal){
//        animals.add(animal);
//    }
//
//    public void removePet(Animal animal){
//        animals.remove(animal);
//    }
//
//
//    public void leavePetWith(Animal animal, Person person){
//        if (person instanceof PhDStudent && animal instanceof Dog) return;
//        if (animals.contains(animal)){
//            animals.remove(animal);
//            person.assignPet(animal);
//            petTransferredTo.put(animal, person);
//        }
//    }
//
//    public void retrievePetFrom(Animal animal, Person person){
//        if (person.hasPet(animal)){
//            person.removePet(animal);
//            assignPet(animal);
//            petReceivedFrom.put(animal, person);
//        }
//    }
//
//    public boolean hasPet(Animal animal){
//        return animals.contains(animal);
//    }
//
//    public boolean hasPets(){
//        return animals.size() > 0;
//    }
//
//    public abstract String getOccupation();
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Person getWhoReceivedPet(Animal animal) {
//        return petTransferredTo.get(animal);
//    }
//
//    public Person getWhoGavePet(Animal animal) {
//        return petReceivedFrom.get(animal);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) return true;
//        if (obj == null || this.getClass() != obj.getClass()) return false;
//        Person p = (Person) obj;
//        return this.getName().equals(p.getName()) && this.getAge() == p.getAge();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, animals);
//    }
//
//    @Override
//    public String toString() {
//        return "Person[" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", animals=" + animals +
//                ']';
//    }
//}
