import java.util.*;
// Program to print unary operator
public class UnaryOp
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        // unary plus
        int a=scan.nextInt();
        boolean value=true;
        System.out.println("Unary Plus: "+a);
        // unary minus
        System.out.println("Unary minus: "+ -a);
        // Increment operator
        System.out.println("Increment Operator: "+ (a++) +", "+ (++a));
        // Decrement operator
        System.out.println("Decrement Operator: "+ (a--) + ", "+(--a));
        // logical complement operator
        System.out.print("Logical Complement Operator: ");
        System.out.println(!value);
    }
}
/*

Output:

Enter a:
10
Unary Plus: 10
Unary minus: -10
Increment Operator: 10, 12
Decrement Operator: 12, 10
Logical Complement Operator: false

 */