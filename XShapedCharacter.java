import java.util.*;

public class XShapedCharacter
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        int row,col;
        String[] str =new String[5];
        System.out.println("Enter the String: ");
        for(int i=0;i<str.length;i++)
        {
            str[i]=in.nextLine();
        }
        for(row=0;row<str.length;row++)
        {
            for(col=0;col<str.length;col++)
            {
                if((row==col) || ((row+col)==(str.length-1)))
                {
                    System.out.print(str[col]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*

Output:
// System.out.print(name[row]);
Enter the String:
h
a
p
p
y
h   h
 a a
  p
 p p
y   y

// System.out.print(name[column]);



Enter the String:
h
a
p
p
y
h   y
 a p
  p
 a p
h   y


 */