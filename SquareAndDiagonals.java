import java.util.*;

public class SquareAndDiagonals
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter No of Rows: ");
        int NoOfRows=scan.nextInt();
        int row,col;
        for(row=1;row<=NoOfRows;row++)
        {
            for(col=1;col<=NoOfRows;col++)
            {
                if((row==col) || (row==1) || (row==NoOfRows) || (col==1) || (col==NoOfRows) || ((row+col)==(NoOfRows+1)))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
