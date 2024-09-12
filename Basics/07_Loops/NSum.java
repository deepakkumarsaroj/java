import java.util.*;

public class NSum {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();

        int sum=0;
        int i = 0;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println("the sum of n numbers:"+sum);
    }
    
}
