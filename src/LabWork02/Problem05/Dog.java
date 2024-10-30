package LabWork02.Problem05;

public class Dog extends Animal{
    public Dog(){}

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void getSound() {
        System.out.println("woof-woof hihi-haha");
    }

    @Override
    public String toString() {
        return super.toString() + "Dog[]";
    }
}