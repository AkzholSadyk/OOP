package lab03.Task6;

import lab03.Task6.Animal;


public class Dog implements Animal {
    private String name;
    private int age;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getSound() {
        System.out.println("woof-woof hihi-haha");
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
                "] Dog[]";
    }
}



//public class Dog extends Animal {
//    public Dog(){}
//
//    public Dog(String name, int age){
//        super(name, age);
//    }
//
//    @Override
//    public void getSound() {
//        System.out.println("woof-woof hihi-haha");
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "Dog[]";
//    }
//}
