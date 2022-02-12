import java.util.*;
// Program to print Largest number among three numbers
public class LargestThreeNo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number1: ");
        long number1= scan.nextLong();;
        System.out.println("Enter Number2: ");
        long number2= scan.nextLong();
        System.out.println("Enter Number3: ");
        long number3= scan.nextLong();
        if(number1>=number2 && number1>=number3)
        {
            System.out.println("The greatest number is "+number1);
        }
        else if(number2>=number1 && number2>=number3)
        {
            System.out.println("The greatest number is "+number2);
        }
        else
        {
            System.out.println("The greatest number is "+number3);
        }
    }
}
/*

Output:

Enter Number1:
99
Enter Number2:
80
Enter Number3:
765
The greatest number is 765

 */