package OOPS;
//Hiding necessary details and showing only important part to the user
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Queen q = new Queen();
        q.moves();
    }
    
}

//abstract classes
//0-100 % Abstraction
abstract class Animal {
    void eat(){System.out.println("animals eats");}
    abstract void walk();
}

class Horse extends Animal {
    void walk(){System.out.println("walks on 4 legs");}

}


class Chicken extends Animal{
    void walk(){System.out.println("walks on 2 legs");}
}



// Interface -> Blueprint of a class
//  Inheritance implements Multiple inheritance
// 100% Absraction 

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down ,left ,right , diagonal(all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
      System.out.println("up,down,left,right");
    }
}