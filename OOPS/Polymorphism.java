package OOPS;
//same work in many forms
public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)3.5));

        Deer d = new Deer();
        d.eat();
    }
    
}


//method overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }

}
// method overriding

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}

class Deer extends Animal{
    void eat(){System.out.println("eat grass");}
}
