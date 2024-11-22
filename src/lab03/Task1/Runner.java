package lab03.Task1;

public class Runner {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        Airplane airplane = new Airplane();

        Swimable[] pool = {fish, duck};
        Flyable[] sky = {airplane, duck};

        for (Swimable swimable : pool) {
            swimable.swim();
        }

        for (Flyable flyable : sky) {
            flyable.fly();
        }

    }
}

