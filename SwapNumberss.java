import java.util.*;
// Program to swap two numbers
public class SwapNumberss
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        long a= scan.nextLong();
        System.out.println("Enter b: ");
        long b= scan.nextLong();
        System.out.println("Before Swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        long temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
/*

Output:

Enter a:
80
Enter b:
90
Before Swapping:
a: 80
b: 90
After Swapping:
a: 90
b: 80




 */