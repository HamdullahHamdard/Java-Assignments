package secondWeek;

import java.util.ArrayList;

public class Main
{
    // static variables
    static int number1;
    
    // this is constant variable
    public static final int number2 = 100;
   
    public static void main(String[] args)
    {
        // creating classes and object
        Student student = new Student(1,"Hamdullah","CS");

        // using classes from the java laberary
        ArrayList<Student> students = new ArrayList<>();  // array of objects

        // System.out.println(student.info.name); //accessing Objects via refrence variables
        
        // constracting Objects using Constractors
        students.add(new Student(2,"Hamdard", "ECO"));

        // pass object of class into method
        Info.showInf0(student);

        // this is immutable
        double d = 10;
        d=20;
        System.out.println("D is : "+d);


        
        // Meutable objects and class
        StringBuilder stringBuilder= new StringBuilder("Mohammad");
        System.out.println("String builder: "+stringBuilder);
        




    }
}
