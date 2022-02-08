import java.util.*;
// Program to find factor of a number
public class FactorOfNo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number= scan.nextLong();
        long i;
        System.out.println("The factors are: ");
        for(i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
/*

Output:

Enter the number:
12
The factors are:
1 2 3 4 6 12

 */