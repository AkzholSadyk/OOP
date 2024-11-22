package lab03.Task6;

import lab03.Task6.Animal;


public class Bird implements Animal {
    private String name;
    private int age;

    public Bird() {
        // Default constructor
    }

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getSound() {
        System.out.println("twee-twee hihi-haha");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "name='" + name + '\'' +
                ", age=" + age +
                "] Bird[]";
    }
}



//public class Bird extends Animal {
//    public Bird(){}
//
//    public Bird(String name, int age){
//        super(name, age);
//    }
//
//    @Override
//    public void getSound() {
//        System.out.println("twee-twee hihi-haha");
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + " Bird[]";
//    }
//}
