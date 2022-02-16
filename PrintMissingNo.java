import java.util.*;
// Program to print the missing number from 1 to n
public class PrintMissingNo
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= scan.nextInt();
        int arr[]=new int[n];
        int i,sum=0,total=0,x;
        System.out.println("Enter array: ");
        for(i=0;i<n-1;i++)
        {
            arr[i]= scan.nextInt();
        }
        sum=(n*(n+1))/2;
        for(i=0;i<n;i++)
        {
            total=total+arr[i];
        }
        x=sum-total;
        System.out.println("The missing number is: "+x);
    }
}
/*

Output:

Enter n:
5
Enter array:
1
3
4
5
The missing number is: 2


 */