package LAB01against0.TASK01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Data data = new Data();
        String w;

        while(true){
            w=scanner.nextLine();

            if(w.equalsIgnoreCase("Q")){
                break;
            }

            try{
                double value=Double.parseDouble(w);
                data.addValue(value);
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again.");
            }
        }
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("Average: "+ df.format(data.getA()));
        System.out.println("Maximum: "+data.getMax());
    }
}
