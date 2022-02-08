import java.util.*;
// Program to print a value for binary to decimal and decimal to binary
public class BiDecTDecBi
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char ch;
        do
        {
            long rem,i=0,decimal=0;
            String binary="";
            System.out.println("Enter your Choice for conversion: 1->Binary to Decimal   2->Decimal to Binary ");
            int option= scan.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Enter the binary number: ");
                    long number= scan.nextLong();
                    long N=number;
                    while(number>0)
                    {
                        rem=number%10;
                        decimal= (long) (decimal+(rem*Math.pow(2,i)));
                        number=number/10;
                        i++;
                    }
                    System.out.println("The decimal number for "+N+" is "+decimal);
                    break;
                case 2:
                    System.out.println("Enter your Decimal number: ");
                    long number1= scan.nextLong();
                    long N1=number1;
                    while(number1>0)
                    {
                        rem=number1%2;
                        binary=rem+binary;
                        number1=number1/2;
                    }
                    System.out.println("The binary number for "+N1+" is "+binary);
                    break;
            }
            System.out.println("Do you wish to continue: ");
            ch=scan.next().charAt(0);
        }while (ch=='y');
    }
}
/*


Output:

Enter your Choice for conversion: 1->Binary to Decimal   2->Decimal to Binary
1
Enter the binary number:
1101
The decimal number for 1101 is 13
Do you wish to continue:
y
Enter your Choice for conversion: 1->Binary to Decimal   2->Decimal to Binary
2
Enter your Decimal number:
13
The binary number for 13 is 1101
Do you wish to continue:
n


 */