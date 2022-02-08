import java.util.*;
// Program to print gcd of a number using recursion
public class GCDRec
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter x: ");
        int x= scan.nextInt();
        System.out.println("Enter y: ");
        int y= scan.nextInt();
        System.out.println("The GCD of a number is "+GCD(x,y));
    }
    public static int GCD(int x,int y)
    {
        if(x==y)
        {
            return x;
        }
        else if(x==0)
        {
            return y;
        }
        else if(y==0)
        {
            return x;
        }
        else if(x>y)
        {
            return GCD(x%y,y);
        }
        else
        {
            return GCD(x,y%x);
        }
    }
}
/*

Output:


Enter x:
12
Enter y:
8
The GCD of a number is 4

 */