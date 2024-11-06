package bonus001;

public class Bird extends Animal {


    public Bird(String name, int age, int energy) {
        super(name, age, energy);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping");
    }

    @Override
    public void move(){
        System.out.println("Bird is moving by fly");
    }

    @Override
    public void fly(int distance){
        System.out.println(name + " flew " + distance + " meters");
    }

    @Override
    public void walk(int distance){
        System.out.println(name + " walked " + distance + " meters");
    }
}
