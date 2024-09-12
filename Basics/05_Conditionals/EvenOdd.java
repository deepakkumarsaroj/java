import java.util.Scanner;

public class EvenOdd {

    public static boolean isEven(int num){

        if(num%2 ==0){
            return true;
        }
        else{
           return false;
        }
        

    }

    public static void main(String[] args){

        

           @SuppressWarnings("resource")
           Scanner inp = new Scanner(System.in);
           System.out.print("Enter a number:");
           int number = inp.nextInt();


           // Even Odd using Conditionals

        // if(num%2 == 0){
        //     System.out.println("The number is even");
        // }
        // else{
        //     System.out.println("The number is odd");
        // }

        // using function
        if(isEven(number)){
            System.out.println("The number is even");
        }
        else{
          System.out.println("The number is odd");
            }

    }
    
}
