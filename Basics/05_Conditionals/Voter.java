import java.util.*;

public class Voter {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        float age = sc.nextFloat();
        if(age>18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
    
}
