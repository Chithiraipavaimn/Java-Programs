
// Program for pojo class
public class Student
{
    private int id;
    private String name;
    private String section,standard;
    public Student()
    {
        System.out.println(".............Student Details........");
    }
    public Student(int id,String name,String standard,String section)
    {
        this.id=id;
        this.name=name;
        this.section=section;
        this.standard=standard;
    }
    public String getName()
    {
        return name;
    }

    public String getStandard()
    {
        return standard;
    }
    public String getSection()
    {
        return section;
    }


    public int getId()
    {
        return id;
    }

}