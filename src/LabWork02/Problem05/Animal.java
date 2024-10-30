package LabWork02.Problem05;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(){}

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void getSound();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.age == animal.age && name == animal.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animal[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
