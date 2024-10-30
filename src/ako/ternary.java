package ako;

public class ternary {
    public static void main(String[] args) {
        int money =100;
        int breadBread = 20;
        int sdacha = money - breadBread;
        int childMoney = sdacha >= 50 ? 10:5;
        sdacha -= childMoney;

        /*if(sdacha >= 50) {
            childMoney =10;
            sdacha -= 10;
        }
        else{
            childMoney = 5;
            sdacha -=5;
        }*/


    }
}
