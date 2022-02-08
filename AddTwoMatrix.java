import java.util.*;
// Program to add two matrices using multidimensional array (2d array)
public class AddTwoMatrix
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N: " );
        int N= scan.nextInt();
        int i,j;
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
        System.out.println("Result by adding both arrays: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                result[i][j]=arr1[i][j]+arr2[i][j];
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
3
2
4
5
6
9
8
7
Enter array2:
3
5
6
7
8
3
1
2
5
Result by adding both arrays:
4	8	8
11	13	9
10	10	12

 */