package lab02.practice;

public class Bonus {

    int a;

    public Bonus(int a) {
        this.a = a;
        String s = "[*]";
        for (int i = a; i >= 0; i--) {
            String sss = s.repeat(i);
            System.out.println(sss);
        }
    }
}
