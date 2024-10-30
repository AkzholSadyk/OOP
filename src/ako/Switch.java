package ako;

public class Switch {
    public static void main(String[] args) {

        int numberDay = 8;
        switch (numberDay) {
            case 1:
                System.out.println("ponedelhik");
                break;
            case 2:
                System.out.println("vtornik");
                break;

            default:
                System.out.println("error");
                break;

        }
        /*if(numberDay == 1){
            System.out.println("ponedelnik");
        }
        else if(numberDay == 2){
            System.out.println("vtornik");
        }*/
    }
}
