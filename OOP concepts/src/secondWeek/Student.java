package secondWeek;

public class Student {
    // vasiblity modifairs
    private int id;
    protected String name;
    public String faculty;

    Info info;


    Student(int id , String name , String faculty)
    {
        // the this refrence
        this.id=id;
        this.name=name;
        this.faculty=faculty;
    }

    // All encapsulation
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setFaculty(String faculty)
    {
        this.faculty=faculty;
    }
    
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getFaculty()
    {
        return faculty;
    }



}
