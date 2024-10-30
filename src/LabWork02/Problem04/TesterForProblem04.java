package LabWork02.Problem04;

public class TesterForProblem04 {
    public static void main(String[] args) {
     Resistor a = new Resistor(2);
     Resistor b = new Resistor(2);
     Resistor c = new Resistor(2);
     Resistor d = new Resistor(2);

     Parallel e = new Parallel(a,b);
     Parallel f = new Parallel(c,d);

     Series g = new Series(e,f);



    }
}
