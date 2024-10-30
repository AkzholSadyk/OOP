package LabWork02.Problem01.PartC;


public class PersonWork extends Object {
    private String name;
    private int year;

    public PersonWork(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj instanceof PersonWork person2) {
            return this.getName().equals(person2.getName()) && this.getYear() == person2.getYear() ;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getYear() % 2;
    }

}