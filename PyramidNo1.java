import java.util.*;
// Program to print pyramid pattern with number as its value
public class PyramidNo1
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter row no:");
        int N= scan.nextInt();
        int row,col,space;
        for(row=1;row<=N;row++)
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

Enter row no:
9
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9


 */