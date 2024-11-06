package bonus001;

public abstract class Animal {
    String name;
    int age;
    int energy;
    public Animal(String name, int age, int energy) {
        this.name = name;
        this.age = age;
        this.energy = energy;
    }
    public abstract void makeSound();
    public abstract void move();
    public void sleep(){
        this.energy+=20;
        System.out.println(this.name + " is sleeping and gaining energy");
    };
    public void eat(int foodEnergy){
        this.energy-=foodEnergy;
        System.out.println(this.name + " is eating and gaining"+foodEnergy+ "energy");
    }

    public void fly(int distance){
        int energy2 = 5*distance;
        energy = energy - energy2;
        System.out.println(name + " is flying and gaining " +energy2+ " energy");
    }
    public void swim(int distance){
        int energy2 = 3*distance;
        energy = energy - energy2;
        System.out.println(name + " is swiming and gaining " +energy2+ " energy");
    }

    public void walk(int distance){
        int energy2 = 2*distance;
        energy = energy - energy2;
        System.out.println(name + " is walking and gaining " +energy2+ " energy");
    }
    public void climb(int distance){
        int energy2 = 4*distance;
        energy = energy - energy2;
        System.out.println(name + " is climbing and gaining " +energy2+ " energy");
    }


}
