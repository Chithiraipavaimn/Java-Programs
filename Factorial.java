import java.util.*;
// Program to find factorial of a number
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        long x=1;
        int i=1;
        System.out.println("Enter the number: ");
        int number=scan.nextInt();
        while(i<=number)
        {
            x=x*i;
            i++;
        }
        System.out.println("Fact of "+number+" is "+x);
    }
}
/*
Output:

Enter the number:
5
Fact of 5 is 120


 */