import java.util.*;
// Program to calculate the power of a number
public class PowerOfNo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number=scan.nextLong();
        System.out.println("Enter the exponent number: ");
        int expo=scan.nextInt();
        int i;
        long result=1;
        for(i=1;i<=expo;i++)
        {
            result=result*number;
        }
        System.out.println("Result of "+number+" power "+expo+" is "+result);
    }
}
/*

Output:

Enter the number:
11
Enter the exponent number:
2
Result of 11 power 2 is 121


 */