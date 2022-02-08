import java.util.*;
// Program to reverse a string using recursion
public class Revstr
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String sentence= scan.nextLine();
        System.out.println("The reversed sentence is "+sentenceRev(sentence));
    }
    public static String sentenceRev(String sentence)
    {
        if(sentence.isEmpty())
        {
            return sentence;
        }
        else
        {
            char ch=sentence.charAt(0);
            return sentenceRev(sentence.substring(1))+ch;
        }

    }
}
/*

Output:

Enter the Sentence:
mobile number
The reversed sentence is rebmun elibom

 */