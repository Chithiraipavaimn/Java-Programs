import java.util.*;
// Program to calculate sum of natural numbers
public class SumOfNaturalNo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        long sum=0;
        int i=1;
        System.out.println("Enter the number: ");
        long number=scan.nextLong();
        while (i<=number)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of Natural number is "+sum);

    }
}
/*

Output:

Enter the number:
100
Sum of Natural number is 5050


 */