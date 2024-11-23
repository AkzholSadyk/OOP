//package LabWork02.Problem05;
//
//
//public class PhDStudent extends Person {
//    private int level;
//
//    public PhDStudent(){}
//
//    public PhDStudent(String name, int age, int level){
//        super(name, age);
//        this.level = level;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//
//    public int getLevel() {
//        return level;
//    }
//
//    @Override
//    public void assignPet(Animal animal) {
//        if (animal instanceof Dog) return;
//        super.assignPet(animal);
//    }
//
//    @Override
//    public String getOccupation() {
//        return "PhdStudent";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (!super.equals(obj)) return false;
//        PhDStudent ps = (PhDStudent) obj;
//        return ps.getLevel() == this.getLevel();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "[PhDStudent{" +
//                "level=" + level +
//                "]]";
//    }
//}