import java.util.*;
// Program to reverse a number
public class ReverseNo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number: ");
        long number= scan.nextLong();
        long rem;
        while(number>0)
        {
            rem=number%10;
            System.out.print(rem);
            number=number/10;
        }
    }
}

/*

Output:

Enter number:
987654321
123456789


 */