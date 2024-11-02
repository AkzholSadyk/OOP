package Pracitce05;

public class Example1
{
    public static void main(String[] args)
    {
        int     denominator, numerator, ratio;

        try {
            numerator = 5;
            denominator = 0;

            ratio = numerator / denominator;
            System.out.println("The answer is: " + ratio);

            System.out.println("Done."); // Don't move this line
        }catch(ArithmeticException e) {
            System.out.println("Divide by 0.");
            e.printStackTrace();
        }
    }
}
