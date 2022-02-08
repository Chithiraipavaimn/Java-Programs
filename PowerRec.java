import java.util.*;
// Program to calculate the power using recursion
public class PowerRec
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= scan.nextInt();
        System.out.println("Enter the exponent number: ");
        int exponent= scan.nextInt();
        System.out.println("The result for "+number+" power "+exponent+" is "+pow(number,exponent));
    }
    public static int pow(int number,int exponent)
    {
        if(exponent==0)
        {
            return 1;
        }
        else
        {
            return number*pow(number,exponent-1);
        }
    }
}
/*

Output:

Enter the number:
5
Enter the exponent number:
3
The result for 5 power 3 is 125


 */