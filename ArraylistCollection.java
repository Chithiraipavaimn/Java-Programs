import java.util.*;
/*Example for Arraylist
Example:
        Input: n=5,a[]={3,4,1,7,9}
        Output: 7
        Explanation: we have to divide the array into two like even
        index and odd index. And sort two in ascending order and then
        add the second largest element from first and second here, even
        sort{1,3,9} and odd={4,7} 3+4=7. */
public class ArraylistCollection
{
    public static void main(String[] args)
    {
                Scanner in=new Scanner(System.in);
                System.out.print("Enter n: ");
                int n=in.nextInt();
                int i,sum;
                int n1=n%2==0?n/2:n/2+1;
                int n2=n-n1;
                int[] a=new int[n];
                System.out.print("Enter the array: ");
                for(i=0;i<n;i++)
                {
                    a[i]=in.nextInt();
                }
                System.out.print("Output: ");
                List<Integer> even=new LinkedList<>();
                List<Integer> odd=new LinkedList<>();
                for(i=0;i<n;i++)
                {
                    if(i%2==0)
                    {
                        even.add(a[i]);
                    }
                    else
                    {
                        odd.add(a[i]);
                    }
                }
                Collections.sort(even);
                Collections.sort(odd);
                sum=even.get(n1-2)+odd.get(n2-2);
                System.out.print(sum);
    }
}
/*

Output:

Enter n: 5
Enter the array: 3
4
1
7
9
Output: 7

 */