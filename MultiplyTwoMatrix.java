import java.util.*;
// Program to print the multiplication of two Matrix using multidimensional array (2d array)
public class MultiplyTwoMatrix
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N: " );
        int N= scan.nextInt();
        int i,j,k;
        int[][] arr1=new int[N][N];
        int[][] arr2=new int[N][N];
        int[][] result=new int[N][N];
        System.out.println("Enter array1: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                arr1[i][j]= scan.nextInt();
            }
        }
        System.out.println("Enter array2: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                arr2[i][j]= scan.nextInt();
            }
        }
        System.out.println("Result by multiplying two array: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                result[i][j]=0;
                for(k=0;k<N;k++)
                {
                    result[i][j]=result[i][j]+(arr1[i][k]*arr2[k][j]);
                }
            }
        }
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
3
Enter array1:
1
2
3
1
4
3
2
2
5
Enter array2:
2
1
3
4
2
5
0
1
2
Result by multiplying two array:
10	8	19
18	12	29
12	11	26


 */