package LAB01against0.TASK01;

public class Data {
    private double sum;
    private double max;
    private int count;

    public Data(){
        this.sum=0;
        this.max=Double.NEGATIVE_INFINITY;
        this.count=0;
    }

    public void addValue(double value){
        sum += value;
        count++;
        if (value>max){
            max=value;
        }
    }
    public double getA(){
        if(count==0){
            return 0;
        }
        return sum/count;
    }

    public double getMax(){
        if (count==0){
            return 0;
        } else {
            return max;
        }
    }
}
