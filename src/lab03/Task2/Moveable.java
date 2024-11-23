package lab03.Task2;

interface Moveable {
    void move();

    default void back(){
        System.out.println("back");
    }


}
