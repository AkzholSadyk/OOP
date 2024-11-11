package lab03.Task2;

interface Moveable {
    void move();

    default void back(){
        System.out.println("back");
    }

//    у интерфейса нету конструктора и атрибута "public static final" = constant
//    интерфейсы отвечает только за дейст
//    все методы публичные
}
