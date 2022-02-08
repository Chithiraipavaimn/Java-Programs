import java.util.*;

public class Pyramid1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter N: ");
        int N=in.nextInt();
        int row,col,i;
        for(row=1;row<=N;row++)
        {
            for(i=1;i<=(N-row);i++)
            {
                System.out.print("@");
            }
            for(col=1;col<=((2*row)-1);col++)
            {
                System.out.print("%");
            }
            for(i=1;i<=(N-row);i++)
            {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
/*

Output:


Enter N:
5
@@@@%@@@@
@@@%%%@@@
@@%%%%%@@
@%%%%%%%@
%%%%%%%%%

 */