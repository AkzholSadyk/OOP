package LabWork02.Problem05;

public class Fish extends Animal{
    public Fish(){}

    public Fish(String name, int age){
        super(name, age);
    }

    @Override
    public void getSound() {
        System.out.println("boolk-boolk hihi-haha");
    }

    @Override
    public String toString() {
        return super.toString() + "Fish[]";
    }
}