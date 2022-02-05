import java.util.*;

public class InvertedRightAngle
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter No Of Rows: ");
        int NoOfRows=scan.nextInt();
        int row,col;
        for(row=NoOfRows;row>=1;row--)
        {
            for (col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
Output:

Enter No Of Rows:
5
* * * * *
* * * *
* * *
* *
*

 */