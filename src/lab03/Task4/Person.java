package lab03.Task4;

public class Person {
    private String name;
    private int ID;
    public Person(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public int getID(){
        return ID;
    }

    public Object Clone(){
        Person p = new Person(this.name, this.ID);
        return p;
    }
    public boolean equals (Object o) {
        if (this == o) return true;
        if (this == null) return false;
        if(!(o instanceof Person)) return false;
        Person p = (Person)o;
        return this.getID() == p.getID();
    }
    public String toString(){
        return "Person:" + getName() + "\nID:" + getID() + '\n';
    }
}
