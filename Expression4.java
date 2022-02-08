import java.util.*;
// Program to find x1 using x value
public class Expression4
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter x: ");
        int x= scan.nextInt();
        int x1;
        x1=++x - x++ + --x;
        System.out.println("Value of x1: "+x1);
    }
}
/*

Output:
Enter x:
5
Value of x1: 6


 */