import java.util.*;

public class Number_Printing
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter N: ");
        int N=in.nextInt();
        int row,col;
        for(row=1;row<=N;row++)
        {
            for(col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
/* Output:
Enter N: 5
    1
    1  2
    1  2  3
    1  2  3  4
    1  2  3  4  5*/