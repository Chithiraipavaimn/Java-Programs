import java.util.*;
//  Program to find prime number or armstrong number using user defined method
public class PrimeOrArmstrongUser
{
    public static boolean Prime(long number)
    {
        int count=0,i;
        if(number<=1)
        {
            return false;
        }
        for(i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                count=1;
            }
        }
        if(count==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
     public static boolean Armstrong(long number1)
     {
         long count=0,sum=0,rem;
         long temp=number1;
         while(number1!=0)
         {
             number1=number1/10;
             count++;
         }
         number1=temp;
         while(number1!=0)
         {
             rem=number1%10;
             sum+= Math.pow(rem,count);
             number1=number1/10;
         }
         if(sum==temp)
         {
             return true;
         }
         else
         {
             return false;
         }
     }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char ch;
        do
        {
            System.out.println("Enter your choice to check the number: 1->Prime or Not 2->Armstrong ");
            int option = scan.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Enter the number: ");
                    long number= scan.nextLong();
                    if(Prime(number))
                    {
                        System.out.println(number+" is a prime number");
                    }
                    else
                    {
                        System.out.println(number+" is not a prime number");
                    }
                    break;
                case 2:
                    System.out.println("Enter the number: ");
                    long number1= scan.nextLong();
                    if(Armstrong(number1))
                    {
                        System.out.println(number1+" is a armstrong number");
                    }
                    else
                    {
                        System.out.println(number1+" is not an armstrong number");
                    }
                    break;
            }
            System.out.println("Do you wish to continue: ");
            ch=scan.next().charAt(0);
        }while(ch=='y');
    }
}
/*

Output:

Enter your choice to check the number: 1->Prime or Not 2->Armstrong
1
Enter the number:
77
77 is not a prime number
Do you wish to continue:
y
Enter your choice to check the number: 1->Prime or Not 2->Armstrong
2
Enter the number:
1634
1634 is a armstrong number
Do you wish to continue:
n


 */