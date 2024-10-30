package LAB01against0.task3;

public class Temperature {

    int temperature;
    public Temperature() {
        this.temperature = temperature;
    }
    public int setCelecium(int temperature) {
        int a = 9*(temperature/5)-32;
        return a;
    }

    public int getFahrenheit(int temperature) {
        int a = 5*(temperature-32)/9;
        return a;
    }

}
