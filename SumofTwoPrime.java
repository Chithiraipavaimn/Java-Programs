import java.util.*;
// Program to check whether a number can be expressed as sum of two prime number
public class SumofTwoPrime
{
    public static boolean sumPrime(int number)
    {
        int i;
        boolean check=true;

        for(i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                check=false;
                break;
            }
        }
            return check;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        boolean flag=false;
        System.out.println("Enter the number: ");
        int number= scan.nextInt();
        int i;
        for(i=2;i<=number/2;i++)
        {
            if (sumPrime(i))
            {
                if((sumPrime(number-i)))
                {
                    System.out.println("The sum of two prime number "+i+ " and "+ (number-i));
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("The number cannot be formed.");
        }
    }
}
/*

Output:


Enter the number:
34
The sum of two prime number 3 and 31
The sum of two prime number 5 and 29
The sum of two prime number 11 and 23
The sum of two prime number 17 and 17



 */