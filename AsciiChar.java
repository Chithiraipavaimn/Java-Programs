import java.util.*;
// Program to print ascii value of a character
public class AsciiChar
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char character=scan.next().charAt(0);
        int ASCII=character;
        System.out.println("ASCII value of Character "+character+" is "+ASCII);
    }
}

/*

Output:

Enter the Character:
A
ASCII value of Character A is 65


 */