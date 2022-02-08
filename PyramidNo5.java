import java.util.*;
// Program to print pyramid pattern with same number present in each column
public class PyramidNo5
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
            for(col=space;col<=N;col++)
            {
                System.out.print(col+" ");
            }
            for(col=N-1;col>=space;col--)
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
                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

 */