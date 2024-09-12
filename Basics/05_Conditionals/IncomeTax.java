import java.util.*;

public class IncomeTax {

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Income:");
        int income = inp.nextInt();
        double tax = 0;

        if(income < 50000){
            tax = 0;       
        }
        else if(income > 50000 && income < 100000){
            tax = 0.2*income;
        }
        else{
            tax = 0.3*income;
        }
        System.out.println("The income tax is:"+tax);

    }
    
    
}
