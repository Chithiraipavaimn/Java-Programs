import java.util.*;
// Program to check whether a character is Alphabet or not
public class AlphabetOrNot
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your character: ");
        char ch=scan.next().charAt(0);
        if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
        {
            System.out.println("The given character is alphabet");
        }
        else
        {
            System.out.println("The given character is not an alphabet");
        }
    }
}

/*

Output:

Enter your character:
7
The given character is not an alphabet

 */