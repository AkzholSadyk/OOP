package lab03.Task2;

public class TesterForInterface {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();


        Moveable[] moveables = new Moveable[2];
        moveables[0] = car;
        moveables[1] = dog;
        for(Moveable moveable : moveables){
            moveable.move();
            moveable.back();
        }
    }
}
