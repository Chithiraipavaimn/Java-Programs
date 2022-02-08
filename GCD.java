import java.util.*;
// Program to find GCD of a number
public class GCD
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int gcd=1;
        System.out.println("Enter x: ");
        int x= scan.nextInt();
        System.out.println("Enter y: ");
        int y= scan.nextInt();
        int i;
        for(i=1;i<=x && i<=y;i++)
        {
            if(x%i==0 && y%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("Gcd of "+x+" and "+y+" is "+gcd);
    }
}

/*

Output:

Enter x:
12
Enter y:
8
Gcd of 12 and 8 is 4



 */