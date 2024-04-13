package OOPS;
//When methods and properties of base class are passed on to child class
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "tony";
        System.out.println(d.name);
    }
    
}

//Base class or Parent class
class Animal{
    String name;
    String color;
    void eat(){System.out.println("Eats");}
    void breathe(){System.out.println("Breathes");}
}

class Dog extends Animal{
    void bark(){System.out.println("Bark");}
    void smell(){System.out.println("Smells");}
}