import java.util.*;
//  Program to find prime number between two intervals using method
public class PrimeNoBTwo
{
    public static boolean primeNo(long start)
    {
        int count=0,i;
        if(start<=1)
        {
            return false;
        }
        for(i=2;i<=Math.sqrt(start);i++)
        {
            if(start%i==0)
            {
                count=1;
            }
        }
        if(count == 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the start number: ");
        long start=scan.nextLong();
        System.out.println("Enter the end number: ");
        long end=scan.nextLong();
        while(start<=end)
        {
            if(primeNo(start))
            {
                System.out.print(start+" ");
            }
            start++;
        }

    }
}
/*

Output:
Enter the start number:
1
Enter the end number:
10
2 3 5 7

 */