import java.util.*;
// Program to generate multiplication table
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int i=1;
        System.out.println("Enter the Table No: ");
        int number= scan.nextInt();
        System.out.println("Enter the range: ");
        int range=scan.nextInt();
        long result;
        System.out.println("Table No: "+number);
        while(i<=range)
        {
            result=i*number;
            System.out.println(number +" * "+i+" = "+result);
            i++;
        }
    }
}
/*

Output:

Enter the Table No:
5
Enter the range:
10
Table No: 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

 */