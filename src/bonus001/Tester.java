package bonus001;

public class Tester {
    public static void main(String[] args) {
        Animal a=new Dog("DOG",5,100);
        a.makeSound();
        a.move();
        a.sleep();
        a.eat(25);
        a.walk(17);
        a.swim(15);
    }
}
