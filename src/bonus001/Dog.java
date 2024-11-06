package bonus001;

public class Dog extends Animal{
    public Dog(String name, int age, int energy) {
        super(name, age, energy);
    }

    @Override
    public void makeSound(){
        System.out.println("Dog is barking");
    }

    @Override
    public void move() {
        System.out.println("Dog moving by walking");
    }

    @Override
    public void walk(int distance) {
        System.out.println(name +" walked " + distance + " meters");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name +" swimming " + distance + " meters");
    }
}
