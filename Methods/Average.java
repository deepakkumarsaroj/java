package Methods;
import java.util.*;

public class Average{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float res = Avg(a,b,c);
        System.out.println(res);

    }

    public static float Avg(float a , float b, float c){
        float avg = (a+b+c)/3;
        return avg;
    }

}