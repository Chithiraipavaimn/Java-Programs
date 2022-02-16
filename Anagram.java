import java.util.*;
// Program to find Anagram
public class Anagram
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1 = scan.next();
        System.out.println("Enter String2: ");
        String str2 = scan.next();
        int i;
        char string1[] = str1.toCharArray();
        char string2[] = str2.toCharArray();
        for(i=0;i<string1.length;i++)
        {
            for(int j=i+1;j<string1.length;j++)
            {
                if(string1[i]>string1[j])
                {
                    char temp=string1[i];
                    string1[i]=string1[j];
                    string1[j]=temp;
                }
            }
        }
        for(i=0;i<string2.length;i++)
        {
            for(int j=i+1;j<string2.length;j++)
            {
                if(string2[i]>string2[j])
                {
                    char temp=string2[i];
                    string2[i]=string2[j];
                    string2[j]=temp;
                }
            }
        }
        str1=Arrays.toString(string1);
        str2=Arrays.toString(string2);
        if(str1.equals(str2))
        {
            System.out.println("Is an Anagram");
        }
        else
        {
            System.out.println("Is not an Anagram");
        }
    }
}
/*

Output:

Enter String1:
motherinlaw
Enter String2:
hitlerwoman
Is an Anagram


 */
