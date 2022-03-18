import java.util.*;
// Program for pojo class
public class StudentDetails
{
    public static void main(String[] args)
    {
        Student s=new Student();
        List<Student> setter=new ArrayList<>();
        Student s1=new Student(01,"Aasha","5th Standard","A");
        Student s2=new Student(02,"Aathi","5th Standard","A");
        Student s3=new Student(03,"Bala","5th Standard","A");
        setter.add(0,s1);
        setter.add(1,s2);
        setter.add(2,s3);
        System.out.println("Roll No\t\tName\t\tStandard\t\t\tSection");
        for(Student i:setter)
        {
            System.out.println(i.getId()+"\t\t\t"+i.getName()+"\t\t"+i.getStandard()+"\t\t"+i.getSection());
        }
    }
}
/*
.............Student Details........
        Roll No		Name		Standard			Section
        1			Aasha		5th Standard		A
        2			Aathi		5th Standard		A
        3			Bala		5th Standard		A

 */