import java.util.*;
// Program to find a number is prime or not
public class PrimeOrNot
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number= scan.nextLong();
        int i,count=0;
        if(number<=1)
        {
            System.out.println("The given number is not a prime number");
        }
        for(i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                count=1;
            }
        }
        if(count==1)
        {
            System.out.println("The given number is not a prime number");
        }
        else
        {
            System.out.println("The given number is prime number");
        }
    }

}
/*

Output:

Enter the number:
51
The given number is not a prime number

 */
