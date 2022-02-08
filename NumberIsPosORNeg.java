import java.util.*;
// Program to check whether the given number is positive or negative
public class NumberIsPosORNeg
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= scan.nextInt();
        if(number>0)
        {
            System.out.println("The given number is positive");
        }
        else if(number<0)
        {
            System.out.println("The given number is negative");
        }
        else
        {
            System.out.println("The given number is equal");
        }
    }
}
/*

Output:

Enter the number:
-98
The given number is negative


 */