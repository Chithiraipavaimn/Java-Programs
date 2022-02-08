import java.util.*;
//Program to print Area of Cylinder
public class AreaCylinder
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float Radius= scan.nextFloat();
        System.out.println("Enter the height: ");
        int Height= scan.nextInt();
        final float pie=3.14f;
        float Area;
        Area=  (2*pie*Radius*(Height+Radius));
        System.out.println("Area of Cylinder: "+Area);
    }
}
/*

Output:

Enter the radius:
3
Enter the height:
5
Area of Cylinder: 150.72

 */