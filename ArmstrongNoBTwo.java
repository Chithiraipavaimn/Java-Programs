import java.util.*;
// Program to print the armstrong number between two intervals
public class ArmstrongNoBTwo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Start number: ");
        long start= scan.nextLong();
        System.out.println("Enter the End number: ");
        long end=scan.nextLong();
        long count,i,rem,sum,temp;
        for(i=start;i<=end;i++)
        {
            count=0;
            sum=0;
            temp=i;
            while(temp!=0)
            {
                temp=temp/10;
                count++;
            }
            temp=i;
            while(temp!=0)
            {
                rem=temp%10;
                sum+=Math.pow(rem,count);
                temp=temp/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}
/*

Output:

Enter the Start number:
999
Enter the End number:
99999


1634
8208
9474


 */