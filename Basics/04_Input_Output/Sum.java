import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);


        //Values given

        // int a = 10;
        // int b = 20;
        // int sum = a+b;
        // System.out.println("The sum is:"+sum);


        //Taking values from user

        System.out.println("Enter two numbers:");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int sum = a+b;
        System.out.println("Sum of two numbers :"+sum);

    }
}