import java.util.*;
//Program to find the area of rectangle
public class AreaRectangle
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Length: ");
        long Length= scan.nextLong();
        System.out.println("Enter the Breadth: ");
        long Breadth= scan.nextLong();
        long Area;
        Area=Length*Breadth;
        System.out.println("Area of Rectangle: "+Area);
    }
}
/*

Output:

Enter the Length:
8
Enter the Breadth:
4
Area of Rectangle: 32


 */