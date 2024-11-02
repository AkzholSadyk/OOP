package Pracitce05;
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
        double leftOperand=0.0, result=0.0, rightOperand=0.0;
        String leftString, operator, rightString;
        StringTokenizer tokenizer;
        Scanner in = new Scanner(System.in);

        String input=in.nextLine();
        StringTokenizer st = new StringTokenizer(input," ",true);

        while(st.hasMoreTokens()) {
            String stt=st.nextToken().trim();
            if(!stt.isEmpty()) {
                tokenizer = new StringTokenizer(stt, "+-*/", true);

                try {
                    leftString = tokenizer.nextToken();
                    operator = tokenizer.nextToken();
                    rightString = tokenizer.nextToken();
                    try {
                        leftOperand = Double.parseDouble(leftString);
                    } catch (NumberFormatException nfe) {
                        System.out.println("The left operand is not a number");
                        return;
                    }
                    try {
                        rightOperand = Double.parseDouble(rightString);
                    } catch (NumberFormatException nfe) {
                        System.out.println("The right operand is not a number");
                        return;
                    }
                    if (operator.equals("+"))
                        result = leftOperand + rightOperand;
                    else if (operator.equals("-")) {
                        result = leftOperand - rightOperand;
                    } else if (operator.equals("*")) {
                        result = leftOperand * rightOperand;
                    } else if (operator.equals("/")) {
                        result = leftOperand / rightOperand;
                    } else
                        result = 0.0;

                    System.out.println("Result: "+stt+ ": "+ result);
                } catch (NoSuchElementException nsee) {
                    System.out.println("Invalid syntax");
                }

            }
        }
    }
}