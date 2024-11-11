package lab03.Task2;

public class Car implements Moveable{
    public void move(){
        System.out.println("Car go");
    }

    @Override
    public void back(){
        System.out.println("Car back");
    }
}
