import java.util.*;

public class Rerverse {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int revNum=0;
        while(num>0){
            int rem=num%10;
            revNum=revNum*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of number is:"+revNum);
    }
    
}
