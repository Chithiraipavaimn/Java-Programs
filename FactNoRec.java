import java.util.*;
// Program to print factorial of a number using recursion
public class FactNoRec
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= scan.nextInt();
        System.out.println("The factorial of "+number+ " is "+fact(number));
    }
    public static long fact(int number)
    {
        if(number==1)
        {
            return 1;
        }
        else
        {
            return number*fact(number-1);
        }
    }
}
/*

Output:

Enter the number:
6
The factorial of 6 is 720

 */