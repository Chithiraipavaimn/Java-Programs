import java.util.*;
// Program to find Quotient and Remainder
public class QuotientRemainder
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Dividend: ");
        long dividend=scan.nextLong();
        System.out.println("Enter the Divisor: ");
        long divisor=scan.nextLong();
        long quotient=dividend/divisor;
        long remainder=dividend%divisor;
        System.out.println("The given value is "+dividend+" its Quotient = "+quotient+" and Remainder = "+remainder);
    }
}

/*

Output:
Enter the Dividend:
25
Enter the Divisor:
4
The given value is 25 its Quotient = 6 and Remainder = 1


 */