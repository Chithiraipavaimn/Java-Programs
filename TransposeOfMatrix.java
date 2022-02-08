import java.util.*;
// Program to print transpose of a matrix
public class TransposeOfMatrix
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int i,j,temp;
        System.out.println("Enter N: ");
        int N= scan.nextInt();
        int[][] arr=new int[N][N];
        System.out.println("Enter array: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
               arr[i][j]= scan.nextInt();
            }
        }
        System.out.println("Before Transpose: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<N;i++)
        {
            for(j=i+1;j<N;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("After Transpose: ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
/*

Output:

Enter N:
3
Enter array:
1
2
3
4
5
6
7
8
9
Before Transpose:
1	2	3
4	5	6
7	8	9
After Transpose:
1	4	7
2	5	8
3	6	9

 */