import java.util.*;
//  Program to multiply two matrices by passing matrix to a function
public class PassingTwoMatrixMultiply
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int i,j,k;
        System.out.println("Enter N: ");
        int N= scan.nextInt();
        System.out.println("Enter M: ");
        int M= scan.nextInt();
        int[][] arr1=new int[N][M];
        int[][] arr2=new int[M][N];
        int[][] result=new int[N][N];
        System.out.println("Enter array1: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<M;j++)
            {
                arr1[i][j]= scan.nextInt();
            }
        }
        System.out.println("Enter array2: ");
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                arr2[i][j]= scan.nextInt();
            }
        }
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                result[i][j]=0;
                for(k=0;k<M;k++)
                {
                    result[i][j]=result[i][j]+(arr1[i][k]*arr2[k][j]);
                }
            }
        }
        System.out.println("Result is: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
/*

Output:

Enter N:
2
Enter M:
3
Enter array1:
3
-2
5
3
0
4
Enter array2:
2
3
-9
0
0
4
Result is:
24	29
6	25


 */