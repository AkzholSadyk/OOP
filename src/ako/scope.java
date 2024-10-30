package ako;

public class scope {
    public static void main(String[] args) {
        double priceCar = 10_000;
        if(priceCar > 9_000){
            priceCar *=0.95;
        }

        System.out.println(priceCar);
    }
}
