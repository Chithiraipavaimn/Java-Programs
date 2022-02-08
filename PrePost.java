import java.util.*;
// Program to find the difference between prefix and postfix
public class PrePost
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value for prefix: ");
        int prefix= scan.nextInt();
        System.out.println("Enter the value for postfix: ");
        int postfix= scan.nextInt();
        ++prefix;
        System.out.println("Value for prefix: "+prefix);
        System.out.println("Value: "+postfix++);
        System.out.println("Value after Increment in postfix: "+postfix);
    }
}
/*

Output:

Enter the value for prefix:
12
Enter the value for postfix:
12
Value for prefix: 13
Value: 12
Value after Increment in postfix: 13


 */