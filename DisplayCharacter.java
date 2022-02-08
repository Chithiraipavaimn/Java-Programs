import java.util.*;
//  Program to Display Character
public class DisplayCharacter
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Starting Charater: ");
        char ch=scan.next().charAt(0);
        System.out.println("Enter the Ending Character: ");
        char ch1=scan.next().charAt(0);
        while(ch<=ch1)
        {
            System.out.print(ch+" ");
            ch++;
        }
    }
}
/*

Output:

Enter the Starting Charater:
A
Enter the Ending Character:
Z
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

 */