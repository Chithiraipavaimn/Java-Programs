import java.util.*;
// Program to convert binary to octal and octal to binary
//  for binary to octal, first convert binary to decimal and then decimal to octal.
// for octal to binary, octal to decimal and then decimal to binary
public class BiOctTOctBi
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char ch;
        do
        {
            long rem, i = 0, decimal = 0;
            String binary = "";
            String octal="";
            System.out.println("Enter your Choice for conversion: 1->Binary to Octal   2->Octal to Binary ");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the binary number: ");
                    long number = scan.nextLong();
                    long N = number;
                    while (number > 0) {
                        rem = number % 10;
                        decimal = (long) (decimal + (rem * Math.pow(2, i)));
                        number = number / 10;
                        i++;
                    }
                    while (decimal > 0) {
                        rem = decimal % 8;
                        octal = rem + octal;
                        decimal = decimal / 8;
                    }
                    System.out.println("The octal number for " + N + " is " + octal);
                    break;
                case 2:
                    System.out.println("Enter the octal number: ");
                    int number1 = scan.nextInt();
                    int N1 = number1;
                    while (number1 > 0) {
                        rem = number1 % 10;
                        decimal = (int) (decimal + (rem * Math.pow(8, i)));
                        number1 = number1 / 10;
                        i++;
                    }
                    while(decimal>0)
                    {
                        rem=decimal%2;
                        binary=rem+binary;
                        decimal=decimal/2;
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

Enter your Choice for conversion: 1->Binary to Octal   2->Octal to Binary
1
Enter the binary number:
101001
The octal number for 101001 is 51
Do you wish to continue:
y
Enter your Choice for conversion: 1->Binary to Octal   2->Octal to Binary
2
Enter the octal number:
67
The binary number for 67 is 110111


 */