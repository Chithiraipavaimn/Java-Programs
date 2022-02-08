import java.util.*;
// Program to print ternary operator
public class TernaryOp
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value= scan.nextInt();
        int Result=(value>10)?++value:--value;
        System.out.println("Result: "+Result);
    }
}
/*

Output:

Enter the value:
12
Result: 13

 */