package LAB01against0.task4;

public class Course {
    public String name ;
    public String description;
    public int credits;
    public String prerequisite ;

    public Course(String name, String description,int credits,String prerequisite ){
        this.credits = credits;
        this.description = description;
        this.name = name;
        this.prerequisite = prerequisite;
    }

}
