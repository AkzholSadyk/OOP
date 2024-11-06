package bonus001;

public class Fish extends Animal{
    public Fish(String name, int age, int energy ) {
        super(name, age, energy);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish is silent.");
    }

    @Override
    public void move(){
        System.out.println("Fish is moving by swim.");
    }

    @Override
    public void swim(int distance){
        System.out.println(name + " swam "+ distance +" meters");
    }
}
