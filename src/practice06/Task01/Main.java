package practice06.Task01;

public class Main {
    public static void main(String[] args) {
        InfoInterface animal = new Animal("cat", 1);
        Person person = new Person("Ruslan", "154531316451");
        getInfo(animal);
        getInfo(person);

    }

    public static void getInfo(InfoInterface infoInterface){
        infoInterface.makeSound();
    }
}
