package OOPS;

public class object {
    public static void main(String args[]){
        Pen p = new Pen();
        p.setColor("Blue");
        System.out.println(p.color);
        p.setTip(5);
        System.out.println(p.tip);
        p.color = "Yellow";
        System.out.println(p.color);
    }
}




class Pen{
     String color;
     int tip;
     
     String getColor(){
        return this.color;
     }

     int getTip(){
        return this.tip;
     }


     void setColor(String newColor){
        this.color = newColor;
     }

     void setTip(int newTip){
        this.tip =  newTip;
     }

}

