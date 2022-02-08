import java.util.*;
//  Program to count number of digits in an integer
public class CountDigitsInNo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number: ");
        long number=scan.nextLong();
         while(number!=0)
        {
            number=number/10;
            count++;
        }
        System.out.println("Number of Digits: "+count);
    }
}
/*

Output:

Enter the number:
789
Number of Digits: 3

 */