package LabWork02.Problem05;

public class Bird extends Animal{
    public Bird(){}

    public Bird(String name, int age){
        super(name, age);
    }

    @Override
    public void getSound() {
        System.out.println("twee-twee hihi-haha");
    }

    @Override
    public String toString() {
        return super.toString() + " Bird[]";
    }
}
