import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Enter an operator:");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Sum is:" + (a + b));
                break;

            case '-':
                System.out.println("Sub is:" + (a - b));
                break;

            case '*':
                System.out.println("Mul is:" + (a * b));
                break;

            case '/':
                System.out.println("Div is:" + (a / b));
                break;

            case '%':
                System.out.println("Remainder is:" + (a % b));
                break;

            default:
                System.out.println("Enter a valid operator");

        }

    }

}
