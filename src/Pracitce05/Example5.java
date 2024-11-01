package Pracitce05;


import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Example5 {

    public static void main(String[] args) {
        double leftOperand, result, rightOperand;
        String leftString, operator, rightString, space;
        StringTokenizer        tokenizer;
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        tokenizer = new StringTokenizer(s1, "+-*/ ", true);

        try{
            while (tokenizer.hasMoreTokens()) {
                leftString = tokenizer.nextToken().trim();

                if (leftString.equals("")) {
                    continue;
                }

                operator = tokenizer.nextToken().trim();
                if (operator.equals("")) {
                    operator = tokenizer.nextToken().trim();
                }

                rightString = tokenizer.nextToken().trim();
                if (rightString.equals("")) {
                    rightString = tokenizer.nextToken().trim();
                }

                leftOperand = Double.parseDouble(leftString);
                rightOperand = Double.parseDouble(rightString);

                if (operator.equals("+")) {
                    result = leftOperand + rightOperand;
                } else if (operator.equals("-")) {
                    result = leftOperand - rightOperand;
                } else if (operator.equals("*")) {
                    result = leftOperand * rightOperand;
                } else if (operator.equals("/")) {
                    result = leftOperand / rightOperand;
                } else {
                    System.out.println("Unknown operator: " + operator);
                    continue;
                }

                System.out.println("Result: " + result);
            }
        }
        catch (NoSuchElementException nsee)
        {
            System.out.println("Invalid syntax");
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("One or more operands is not a number");
        }

    }

}
