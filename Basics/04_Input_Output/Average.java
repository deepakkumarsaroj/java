import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Float a = inp.nextFloat();
        Float b = inp.nextFloat();
        Float c = inp.nextFloat();
        Float d = inp.nextFloat();
        Float e = inp.nextFloat();

        Float avg = (a+b+c+d+e)/5;
        System.out.println("The average is:"+avg);
    }
    
}
