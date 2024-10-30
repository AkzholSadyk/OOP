package LabWork01.Task01;

public class Task1 {
    private static int count ;
    private double sum;
    private double maximum;

    public Task1() {
        this.sum = 0;
        this.count = 0;
        this.maximum = 0;
    }

    public void add(double sss) {
        sum+=sss;
        count++;
        if(sss>maximum){
            maximum=sss;
        }
    }

    public double getAverage(){
        return sum/count;
    }

    public double getMaximum(){
        return maximum;
    }


}
