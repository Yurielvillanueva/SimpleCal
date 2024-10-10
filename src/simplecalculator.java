// Simple Calculator
import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Simple Calculator : By Yuri");
        System.out.print("Choose a number: ");
        int num = scan.nextInt();
        System.out.print("Operator: + | - | * / | ");
        char operator = scan.next().charAt(0);
        System.out.print("Choose a second number: ");
        int num2 = scan.nextInt();
        int result;

        switch (operator) {
            case '+':
                result =  (num+num2);
                break;
            case '-':
                result = (num - num2);
                break;
            case '*':
                result = (num *num2);
                break;
            case '/':
                result = (num / num2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}