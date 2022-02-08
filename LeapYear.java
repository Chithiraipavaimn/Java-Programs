import java.util.*;
// Program to find leap year or not
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year: ");
        long year= scan.nextLong();
        if((year%4==0) && (year%100!=0) ||(year%400==0))
        {
            System.out.println(year+" is a Leap Year");
        }
        else
        {
            System.out.println(year+" is not a Leap Year");
        }
    }
}

/*
Output:

Enter the year:
2012
2012 is a Leap Year


 */