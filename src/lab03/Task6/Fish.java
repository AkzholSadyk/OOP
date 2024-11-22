package lab03.Task6;




public class Fish implements Animal {
    private String name;
    private int age;

    public Fish() {

    }

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getSound() {
        System.out.println("boolk-boolk hihi-haha");
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
                "] Fish[]";
    }
}



//public class Fish extends Animal {
//    public Fish(){}
//
//    public Fish(String name, int age){
//        super(name, age);
//    }
//
//    @Override
//    public void getSound() {
//        System.out.println("boolk-boolk hihi-haha");
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "Fish[]";
//    }
//}