package practice06.Task02;

public class Person implements CanHavePizza, CanHaveAlcahol, MoneyForWaiter, Comparable<Person> {
    private String name;
    private int age;
    private int money;
    private String Name_pizza;
    private String want_alcahol;
    private boolean drunk = false;

    public Person(String name, int age, int money, String name_pizza, String want_alcahol) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.Name_pizza = name_pizza;
        this.want_alcahol = want_alcahol;
    }

    public Person() {}

    public String getName() {return name;}

    public int getAge() {return age;}

    public int getMoney() {return money;}

    public String getName_pizza() {return Name_pizza;}

    public String getWant_alcahol() {return want_alcahol;}

    public boolean isDrunk() {return drunk;}




    @Override
    public void eat() {
        System.out.println(name + " take your pizza.");
    }

    @Override
    public void drink(){
        System.out.println(name +" you can take your alcahol because you have "+ age);
        drunk = true;
    }

    @Override
    public void tips(boolean b){
        if(b){
            System.out.println("Wallet: " + money*0.5);
        }
        else{
            System.out.println("Wallet: " + money);
        }
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(o instanceof Person pizza2) {
            return this.getName_pizza().equals(pizza2.getName_pizza());
        }
        return false;
    }

}

