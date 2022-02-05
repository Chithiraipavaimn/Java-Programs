import java.util.*;

public class NumberPrintingCon
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter N: ");
        int N=in.nextInt();
        int row,col,i=1;
        for(row=1;row<=N;row++)
        {
            for(col=1;col<=row;col++)
            {
                System.out.print(i+"\t");
                i++;
            }
            System.out.println();
        }
    }
}
/* Output
  Enter N: 5
   1
   2  3
   4  5  6
   7  8  9  10
   11 12 13 14 15   */
