package lab03.Task5;


public class Chocolate implements Comparable<Chocolate>{
    private double weight ;
    private String name;

    public Chocolate(String name , double weight) {
        this.name = name ;
        this.weight = weight ;
    }
    @Override
    public String toString() {
        return "name : " + name + " , weight : " + weight ;
    }
    @Override
    public int compareTo(Chocolate c) {
        if(this.weight > c.weight) {
            return 1 ;
        }
        if(this.weight < c.weight) {
            return -1 ;
        }
        return 0 ;
    }

}
