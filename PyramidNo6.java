import java.util.*;
// Program to print inverted pyramid start pattern
public class PyramidNo6
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int row,col,space;
        System.out.println("Enter N: ");
        int N= scan.nextInt();
        for(row=N;row>=1;row--)
        {
            for(space=1;space<=(N-row);space++)
            {
                System.out.print(" ");
            }
            for(col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*

Output:

Enter N:
9
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *


 */