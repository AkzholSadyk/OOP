package Practice03;

public class Cat extends Animal {
    private String color;
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating cats food");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping on the cats bed");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking like as cats");
    }

    public String getColor() {
        return color;
    }
}
