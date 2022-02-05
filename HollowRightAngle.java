import java.util.*;

public class HollowRightAngle
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter No of Rows: ");
        int NoOfRows=scan.nextInt();
        int row,col;
        for(row=1;row<=NoOfRows;row++)
        {
            for(col=1;col<=row;col++)
            {
                if((col==1) || (row==col) || (row==NoOfRows))
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


/*

Output:

Enter No of Rows:
5
*
* *
*   *
*     *
* * * * *



 */