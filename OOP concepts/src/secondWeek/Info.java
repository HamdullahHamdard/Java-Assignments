package secondWeek;

public class Info 
{
    String name="This is info class";    


    // this is the static method
    static void showInf0( Student student)
    {
        // this is the scope of variables
        // only access in this method
        int id=10;
        String name1="Khan";
        System.out.println("This is the info class: this is the static showInfo method");
    }

}
