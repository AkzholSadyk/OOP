package lab02;
public class ForTask2 {
    int a;

    public ForTask2(int a) {
        this.a = a;
        String s = "[*]";
        for (int i = 1; i <= a; i++) {
            String sss = s.repeat(i);
            System.out.println(sss);
        }
    }
}
