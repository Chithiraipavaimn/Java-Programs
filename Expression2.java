import java.util.*;
// Program to print the expression value
public class Expression2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter X: ");
        int x= scan.nextInt();
        System.out.print("Value for x= x++ * 2 + 3 * --x: ");
        x= x++ * 2 + 3 * --x;
        System.out.println(x);
    }
}

/*

Output:
Enter X:
2
Value for x= x++ * 2 + 3 * --x: 10

 */