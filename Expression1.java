import java.util.*;
// Program to print the expression value
public class Expression1
{
    public static void main(String[] argss)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a= scan.nextInt();
        System.out.print("Value for the expression a+=a++ + ++a + --a + a--: ");
        a+=a++ + ++a + --a + a--;
        System.out.println(a);
    }
}
/*
Output:

Enter a:
28
Value for the expression a+=a++ + ++a + -a+a--: 144

 */