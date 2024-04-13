package OOPS;
 
// Wrwping up code and data in a single unit (class).
//Data hiding using access specifiers.
public class Encapsulation {
    public static void main(){
        BankAccount myAcc = new BankAccount();
        myAcc.name = "Deepak";
        System.out.println(myAcc.name);
    }
    
}

class BankAccount{
    public String name;
    protected String Password;
}
