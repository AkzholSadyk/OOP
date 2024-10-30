package LAB01against0.task4;



import java.util.*;

public class GradeBookTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentsNum = input.nextInt();
        input.nextLine();

        Course course = new Course("Object-oriented Programming and Design","Good Course",3,"CSCI1204");


        GradeBook gradesBook = new GradeBook();
        System.out.print(gradesBook.displayMessage() + course.name + "!\n");
        for(int i = 0; i < studentsNum;i++) {
            String name = input.nextLine();
            //Student stud = new Student(name,2024);
            double grade = input.nextDouble();
            input.nextLine();
            GradeBook gradebook = new GradeBook(name,grade);
            gradesBook.getSum();
        }
        System.out.print("Class average is " + gradesBook.determineClassAverage()+ ". "+gradesBook.getHigh()+". "+gradesBook.getLow() + "\n");

        gradesBook.outputBarChart();
    }

}
