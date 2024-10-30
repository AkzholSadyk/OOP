package Midterm_training.problem01;

public class ako extends Dormotory {
    private String room;
    private int floor;
    private String school;

    public ako(String name, String surname, int age,String room, int floor, String school) {
        super(name, surname, age);
        this.room = room;
        this.floor = floor;
        this.school = school;
    }

    @Override
    public void studentFromDorm(){
        System.out.println("Student from Dorm:" + surname +" "+ name + " " + age + " " + room + " " + floor + " " + school );
    }

}
