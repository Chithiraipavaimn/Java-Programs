import java.util.*;
// Program to find LCM of a number
public class LCM
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int gcd=1,i,lcm;
        System.out.println("Enter x: ");
        int x= scan.nextInt();
        System.out.println("Enter y: ");
        int y= scan.nextInt();
        for(i=1;i<=x && i<=y;i++)
        {
            if(x%i==0 && y%i==0)
            {
                gcd=i;
            }
        }
        lcm=(x*y)/gcd;
        System.out.println("LCM of "+x+" and "+y+" is "+lcm);
    }
}
/*

Output:

Enter x:
12
Enter y:
9
LCM of 12 and 9 is 36


 */