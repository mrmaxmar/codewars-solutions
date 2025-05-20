package calculator;

import java.util.Scanner;

public class Calculator{
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
        boolean valid = true;

        if (op.length()==1) {
            switch(op){
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Divided by 0. Result: Undefined");
                            valid = false;
                        }
                        break;
                    default:
                        System.out.println("Unsupported operation.");
                        valid = false;
                }
            } else {
                System.out.println("Unsupported operation.");
                valid = false;}

                if (valid) {
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                }
        System.out.println("Would you like to do another calculation? (y/n)");
            again = input.next().trim().toLowerCase();
        }

        System.out.println("Thanks for using the calculator. Goodbye!");
        input.close();

            }
        }