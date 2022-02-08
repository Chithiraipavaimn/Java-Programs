import java.util.*;
// Program to find whether a given character is vowel or consonant
public class VowelOrConstant
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Character: ");
        char ch=scan.next().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
        {
            System.out.println("The given character is Vowel");
        }
        else
        {
            System.out.println("The given character is Consonant");
        }
    }
}
/*

Output:

Enter your Character:
a
The given character is Vowel

 */