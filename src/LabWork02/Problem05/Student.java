//package LabWork02.Problem05;
//
//
//public class Student extends Person {
//    private Degree degree;
//
//    public Student(){}
//
//    public Student(String name, int age, Degree degree){
//        super(name, age);
//        this.degree = degree;
//    }
//
//    public void setDegree(Degree degree) {
//        this.degree = degree;
//    }
//
//    public Degree getDegree() {
//        return degree;
//    }
//
//    @Override
//    public String getOccupation() {
//        return getDegree() + " Student";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (!super.equals(obj)) return false;
//        lab03.Task6.Student s = (lab03.Task6.Student) obj;
//        return s.degree == this.degree;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "[Student[" +
//                "degree=" + degree +
//                "]]";
//    }
//}