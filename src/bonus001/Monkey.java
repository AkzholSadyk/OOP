package bonus001;

public class Monkey extends Animal{
    public Monkey(String name, int age ,int energy) {
        super(name ,age, energy);
    }
    @Override
    public void makeSound(){
        System.out.println("Monkey is screeching");
    }
    @Override
    public void move() {
        System.out.println("Monkey is moving by walking and climbing.");
    }
    @Override
    public void walk(int distance){
        System.out.println(name+ " walked "+ distance + " meters");
    }
    @Override
    public void climb(int distance){
        System.out.println(name+ " climbed "+ distance + " meters");
    }
}
