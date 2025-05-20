package calculator;

import java.util.Scanner;

public class CalculatorOriginal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String again = "y";
        
while(again.equals("y")) {
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter operation (+ or - or * or /): ");
        String op = input.next();

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        double result = 0;

    if (op.length() == 1){
        if (op.equals("+")) {
            result = num1 + num2;
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);

        } else if (op.equals("-")) {
            result = num1 - num2;
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);

        } else if (op.equals("*")) {
            result = num1 * num2;
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);

        } else if (op.equals("/")) { 
            if (num2 != 0) {
            result = num1 / num2;      
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);      
            } else {
                System.out.println("Divided by 0. Result: Undefined");
                continue;
            }

        } else { System.out.println("Unsupported operation.");
            continue;
        }
    } else { System.out.println("Unsupported operation.");
            continue;
        }

        System.out.println("Would you like to do another calculation? (y/n)");
        again = input.next().trim().toLowerCase();
    }
        input.close();
}

}

/* 
This version will keep prompting the user until they enter a valid entry. 
Then it will allow them to continue to the (y/n) question
*/