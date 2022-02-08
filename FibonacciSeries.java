import java.util.*;
// Program to print fibonacci series
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scan.nextInt();
        int a=0,b=1,c;
        int i=2;
        System.out.println(a);
        System.out.println(b);
        while(i<number)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
    }
}
/*

Output:

Enter the number:
5
0
1
1
2
3


 */