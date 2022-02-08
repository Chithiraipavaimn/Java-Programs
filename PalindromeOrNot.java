import java.util.*;
// Program to check whether a number is palindrome or not
public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number: ");
        long number=scan.nextLong();
        long orino=number;
        long number1=0,rem;
        while(number>0)
        {
            rem=number%10;
            number1=(number1*10)+rem;
            number=number/10;
        }
        if(orino==number1)
        {
            System.out.println("The given number is a palindrome");
        }
        else
        {
            System.out.println("The given number is not a palindrome");
        }
    }
}
/*

Output:

Enter Number:
1234
The given number is not a palindrome


 */