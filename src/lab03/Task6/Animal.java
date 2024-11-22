package lab03.Task6;


import java.util.Objects;

public interface Animal {


    void getSound();


    static boolean equals(Animal a1, Animal a2) {
        if (a1 == a2) return true;
        if (a1 == null || a2 == null) return false;
        return a1.getName().equals(a2.getName()) && a1.getAge() == a2.getAge();
    }

    static int hashCode(Animal animal) {
        return Objects.hash(animal.getName(), animal.getAge());
    }

    static String toString(Animal animal) {
        return "Animal[" +
                "name='" + animal.getName() + '\'' +
                ", age=" + animal.getAge() +
                ']';
    }


    String getName();
    int getAge();
}




//
//import java.util.Objects;
//
//public abstract class Animal {
//    private String name;
//    private int age;
//
//    public Animal(){}
//
//    public Animal(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public abstract void getSound();
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return this.age == animal.age && name == animal.name;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//
//    @Override
//    public String toString() {
//        return "Animal[" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ']';
//    }
//}
