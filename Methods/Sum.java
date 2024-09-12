package Methods;
import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float res = sum(a, b);
        System.out.println(res);

    }

    static float sum(float a,float b){
        float sum =a+b;
        return sum;

    } 
}
