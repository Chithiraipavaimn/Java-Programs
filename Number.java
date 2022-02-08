import java.text.DecimalFormat;
import java.util.*;
// Program to print a number without using string
public class Number
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        float Number=scan.nextFloat();
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("Number: "+df.format(Number));
    }
}
/*

Output:

Enter the Number:
7.50
Number: 7.50

 */