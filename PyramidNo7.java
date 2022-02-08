import java.util.*;
// Program to print inverted pyramid using numbers
public class PyramidNo7
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
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
/*

Output:

Enter N:
9
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1

 */