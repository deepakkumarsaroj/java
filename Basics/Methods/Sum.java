package Basics.Methods;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res = sum(a,b);
        System.out.println(res);
    }

    static int sum(int a,int b){
        int res = a+b;
        return res;
    }
    
}
