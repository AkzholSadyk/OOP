package lab03.Task6;



public class Test {
    public static void main(String[] args) {
        PhDStudent phDStudent = new PhDStudent("Idontknow", 100, 1);
        Employee employee = new Employee("AlsoIdontKnow", 50, Grading.MASTER);
        Student student = new Student("AlsoIdontKnow2", 15, Degree.MASTER);

        Dog dog = new Dog("Bobik", 4);
        Cat cat = new Cat("Murka", 5);
        Fish fish = new Fish("Erasyl", 1);




        student.assignPet(fish);
        student.leavePetWith(cat, employee);
        student.retrievePetFrom(cat, employee);
        PersonRegistry.addPerson(student);

        phDStudent.assignPet(cat);
        phDStudent.leavePetWith(cat, employee);
        phDStudent.retrievePetFrom(cat, employee);
        PersonRegistry.addPerson(phDStudent);

        employee.assignPet(dog);
        employee.leavePetWith(dog, phDStudent);
        employee.retrievePetFrom(dog, phDStudent);
        PersonRegistry.addPerson(employee);


        PersonRegistry.print();

    }
}