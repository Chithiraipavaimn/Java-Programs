import java.util.*;

public class XShapedPattern
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter N: ");
        int N=in.nextInt();
        int row,col;
        for(row=0;row<N;row++)
        {
            for(col=0;col<N;col++)
            {
                if((row==col) || ((row+col)==N-1))
                {
                    System.out.print("*");
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
Enter N:
5
*   *
 * *
  *
 * *
*   *


 */