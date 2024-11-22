package lab03.Task6;




public class Cat implements Animal {
    private String name;
    private int age;

    public Cat() {

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getSound() {
        System.out.println("meow-meow hihi-haha");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "name='" + name + '\'' +
                ", age=" + age +
                "] Cat[]";
    }
}



//public class Cat extends Animal {
//    public Cat(){}
//
//    public Cat(String name, int age){
//        super(name, age);
//    }
//
//    @Override
//    public void getSound() {
//        System.out.println("meow-meow hihi-haha");
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "Cat[]";
//    }
//}