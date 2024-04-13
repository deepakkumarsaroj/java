package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ram";
        Student s2 = new Student("Deeepak");
        System.out.println(s2.name);

        Student s3 = new Student(s1);
        s3.Password="jhdakj";

        System.out.println(s3.name);
    }
    
}

class Student{
    String name;
    int roll;
    String Password;

    Student (Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }

    Student(){
     System.out.println("constructor is called ...........");
    }

    Student(String name){
        this.name = name;
    }
}