import java.util.*;
//  Program to multiply two matrices by passing matrix to a function
public class PassingTwoMatrixMultiply
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, k;
        System.out.println("Enter N1: ");
        int N1 = scan.nextInt();
        System.out.println("Enter M1: ");
        int M1 = scan.nextInt();
        System.out.println("Enter N2: ");
        int N2 = scan.nextInt();
        System.out.println("Enter M2: ");
        int M2 = scan.nextInt();
        int[][] arr1 = new int[N1][M1];
        int[][] arr2 = new int[N2][M2];
        System.out.println("Enter array1: ");
        for (i = 0; i < N1; i++) {
            for (j = 0; j < M1; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter array2: ");
        for (i = 0; i < N2; i++) {
            for (j = 0; j < M2; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }
        Multiply(arr1,arr2,N1,M1,N2,M2);

    }
    public static void Multiply(int[][] arr1,int[][] arr2,int N1,int M1,int N2,int M2)
    {
        int i,j,k;
        int[][] result = new int[N1][M2];
        for(i=0;i<N1;i++)
        {
            for(j=0;j<M2;j++)
            {
                result[i][j]=0;
                for(k=0;k<M1;k++)
                {
                    result[i][j]=result[i][j]+(arr1[i][k]*arr2[k][j]);
                }
            }
        }
        System.out.println("Result is: ");
        for(i=0;i<N1;i++)
        {
            for(j=0;j<M2;j++)
            {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
/*

Output:

Enter N1:
2
Enter M1:
3
Enter N2:
3
Enter M2:
2
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