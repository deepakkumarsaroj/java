import java.util.*;

public class Largest {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        Float a = sc.nextFloat();
        Float b = sc.nextFloat();
        Float c = sc.nextFloat();

        float max = 0;

        if(a>b && a>c){
            max = a;   
        }
        else if(b>a && b>c){
            max = b;
        }
        else{
            max=c;
        }

        System.out.println("Largest number is:"+max);
        


    }
    
}
