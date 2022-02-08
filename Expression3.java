import java.util.*;
// Program to print the value to find z using the value of y
public class Expression3
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Y: ");
        int y= scan.nextInt();
        int z;
        z=(++y*(y++ + 5));
        System.out.println("Value of z: "+z);
    }
}
/*

Output:

Enter Y:
10
Value of z: 176

 */