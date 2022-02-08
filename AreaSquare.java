import java.util.*;
//Program to find the area of square

public class AreaSquare
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Base value: ");
        long Base= scan.nextLong();
        System.out.println("Enter Height value: ");
        long Height= scan.nextLong();
        long Area;
        Area=Base*Height;
        System.out.println("Area of Square: "+Area);
    }
}
/*

Output:

Enter Base value:
5
Enter Height value:
5
Area of Square: 25

 */