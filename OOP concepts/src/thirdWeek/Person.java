package thirdWeek;

public class Person
{
    int id;
    String name;
    String faculty;
    String organization;

    Person(int id , String name , String faculty , String organization)
    {
        this.id=id;
        this.name=name;
        this.faculty=faculty;
        this.organization=organization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
