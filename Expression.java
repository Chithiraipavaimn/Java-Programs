import java.util.*;
// Print the expressions value
public class Expression
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scan.nextInt();
        System.out.println("Enter b: ");
        int b=scan.nextInt();
        int x;
        System.out.print("Value of ++a-b--: ");
        System.out.println(++a-b--);
        System.out.print("Value of a%b++: ");
        System.out.println(a%b++);
        System.out.print("Value of a*=b+5: ");
        System.out.println(a*=b+5);
        System.out.print("Value of x=69>>>2");
        x=69>>>2;
        System.out.println(x);

    }
}
/*

Output:

Enter a:
20
Enter b:
25
Value of ++a-b--: -4
Value of a%b++: 21
Value of a*=b+5: 630
Value of x=69>>>217


 */