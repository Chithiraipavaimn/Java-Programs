import java.util.*;
// Program to print bitwise operator
public class BitwiseOp
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter X: ");
        int x= scan.nextInt();
        System.out.println("Enter Y: ");
        int y= scan.nextInt();
        // Bitwise AND
        System.out.println("Bitwise AND: "+ (x&y));
        // Bitwise Exclusive OR
        System.out.println("Bitwise Exclusive OR: "+(x^y));
        // Bitwise Inclusive OR
        System.out.println("Bitwise Inclusive OR: "+(x|y));
        // Bitwise Complement
        System.out.println("Bitwise Complement: "+ (~x));
        // Bitwise Left Shift
        System.out.println("Bitwise Left Shift: "+ (x<<2));
        // Bitwise Right Shift
        System.out.println("Bitwise Right Shift: "+(x>>2));
        // Bitwise Unsigned Right Shift
        System.out.println("Bitwise Unsigned Right Shift: "+ (x>>>2));
    }
}
/*
Output:

Enter X:
8
Enter Y:
9
Bitwise AND: 8
Bitwise Exclusive OR: 1
Bitwise Inclusive OR: 9
Bitwise Complement: -9
Bitwise Left Shift: 32
Bitwise Right Shift: 2
Bitwise Unsigned Right Shift: 2


 */