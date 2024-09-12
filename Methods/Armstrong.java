package Methods;
import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        boolean res = isArmstrong(num);
        System.out.println(res);
    }

    public static boolean isArmstrong(int num){
        int original = num;
        int sum =0;
        while(num > 0){
            int rem = num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        return sum==original;
    }
}