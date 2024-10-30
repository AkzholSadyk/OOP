package Midterm_training.problem02;

public class Dorm extends Object{
    private String name;
    private int room;

    public Dorm(String name, int room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public int getRoom() {
        return room;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Dorm dormot) {
            return this.getName().equals(dormot.getName()) && this.getRoom() == dormot.getRoom();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getRoom() % 2;
    }
}
