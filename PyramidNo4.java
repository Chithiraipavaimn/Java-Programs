import java.util.*;
// Program to print pyramid pattern with continuous and reverse number
public class PyramidNo4
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int row,col,space;
        System.out.println("Enter N: ");
        int N= scan.nextInt();
        for(row=1;row<=N;row++)
        {
            for(space=1;space<=(N-row);space++)
            {
                System.out.print("  ");
            }
            for(col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            for(col=row-1;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
/*

Output:

Enter N:
9
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

 */