package Methods;
import java.util.*;

public class Area{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);


        //Area of Rectangle
        // System.out.println("Enter length of rectangle:");
        // int a  = sc.nextInt();
        // System.out.println("Enter breadth of rectangle:");
        // int b =sc.nextInt();
        // int res = Rectangle(a,b);
        // System.out.println("Area of Rectangle:"+res);

        //Area of Circle
        System.out.println("Enter the radius of circle:");
        float r = sc.nextFloat();
        float res = Circle(r);
        System.out.println("Area of Circle:"+res);

    }

    public static int Rectangle(int l,int h){
        int area = l*h;
        return area;
    }

    public static float Circle(float r){
            float area = 3.14f *(r*r);
            return area;
    }
}
