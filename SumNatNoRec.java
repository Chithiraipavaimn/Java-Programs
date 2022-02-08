import java.util.*;
// Program to find sum of natural number using recursion
public class SumNatNoRec
{
    public static long sumNo(int number)
    {
        if(number!=0)
        {
            return number+sumNo(number-1);
        }
        else
        {
            return number;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= scan.nextInt();
        long sum=sumNo(number);
        System.out.println("The sum of natural number is "+sum);

    }
}
/*

Output:

Enter the number:
10
The sum of natural number is 55

 */