package lab03.Task5;

public class Time implements Comparable<Time>{
    public int hour ;
    public int minute ;
    public int second ;

    public Time(int h , int m , int s) {
        this.hour = h ;
        this.minute = m ;
        this.second= s ;
    }
    public String toUniversal() {
        return (hour < 10 ? "0" + hour : hour) + ":" +  (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second);
    }
    public String toStandard() {
        return (hour > 12 ? hour - 12 : (hour < 10 ? "0" + hour : hour)) + ":" + (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second + hour) + " " + (hour > 12 ? "PM" : "AM");
    }
    public void add(Time time) {
        this.hour = time.hour ;
        this.minute = time.minute ;
        this.second = time.second ;
    }
    @Override
    public int compareTo(Time o) {
        int thisTimeSum = this.hour * 3600 + this.minute * 60 + this.second ;
        int oTimeSum = o.hour * 3600 + o.minute * 60 + o.second ;
        if(thisTimeSum < 3600 && oTimeSum >= 3600) {
            return 1 ;
        }
        else if(thisTimeSum >=3600 && oTimeSum < 3600) {
            return -1;
        }
        return Integer.compare(thisTimeSum, oTimeSum) ;
    }
}