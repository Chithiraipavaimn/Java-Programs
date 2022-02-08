import java.util.*;
//  Program to Check Armstrong number or not
public class ArmstrongNo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number= scan.nextLong();
        long count=0,sum=0,rem;
        long temp=number;
        while(number!=0)
        {
            number=number/10;
            count++;
        }
        number=temp;
        while(number!=0)
        {
            rem=number%10;
            sum+= Math.pow(rem,count);
            number=number/10;
        }
        if(sum==temp)
        {
            System.out.println("The given number "+temp+" is an Armstrong number");
        }
        else
        {
            System.out.println("The given number "+temp+" is not an Armstrong number");
        }

    }
}
/*

Output:

Enter the number:
1635
The given number 1635 is not an Armstrong number


 */