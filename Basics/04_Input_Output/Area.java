import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);

        // Area of triangle
        System.out.print("Enter the length of triangle:");
        int l = inp.nextInt();
        System.out.print("Enter the height of triangle:");
        int h = inp.nextInt();

        
        double area = (0.5*l*h);
        System.out.println("The area of triangle is:"+area);



        //Area of rectangle

        // System.out.print("Enter the length of rectangle:");
        // float a = inp.nextFloat();
        // System.out.print("Enter the breadth of rectangle:");
        // float b = inp.nextFloat();

        // double area2 = a*b;
        // System.out.println("Area of rectangle:"+area2);



        //Area of Circle

        // System.out.print("Enter the radius of Circle:");
        // Float rad = inp.nextFloat();

        // double areaC = (3.14*rad*rad);
        // System.out.println("Area of Circle:"+areaC);
    }
}
