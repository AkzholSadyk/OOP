package Practice03;

public class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name+"eating");
    }
    public void sleep() {
        System.out.println(name+"sleeping");
    }
    public void walk() {
        System.out.println(name+"walking");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
