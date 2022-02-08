import java.util.*;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number= scan.nextLong();
        if(number%2==0)
        {
            System.out.println("The given number is Even");
        }
        else
        {
            System.out.println("The given number is Odd");
        }
    }
}

/*

Output:

Enter the number:
573
The given number is Odd

 */