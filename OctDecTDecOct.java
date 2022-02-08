import java.util.*;
// Program to print octal to decimal and decimal to octal
public class OctDecTDecOct
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        char ch;
        do
        {
            int rem,i=0,decimal=0;
            String octal="";
            System.out.println("Enter your conversion type: 1->Octal to Decimal   2->Decimal to Octal ");
            int option= scan.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Enter the octal number: ");
                    int number = scan.nextInt();
                    int N = number;
                    while (number > 0) {
                        rem = number % 10;
                        decimal = (int) (decimal + (rem * Math.pow(8, i)));
                        number = number / 10;
                        i++;
                    }
                    System.out.println("The decimal number for " + N + " is " + decimal);
                    break;
                case 2:
                    System.out.println("Enter the decimal number: ");
                    int number1= scan.nextInt();
                    int N1=number1;
                    while(number1>0)
                    {
                        rem=number1%8;
                        octal=rem+octal;
                        number1=number1/8;
                    }
                    System.out.println("The octal number for "+N1+" is "+octal);
                    break;
            }
            System.out.println("Do you wish to continue: ");
            ch=scan.next().charAt(0);
        }while(ch=='y');
    }
}
/*

Output:

Enter your conversion type: 1->Octal to Decimal   2->Decimal to Octal
1
Enter the octal number:
167
The decimal number for 167 is 119
Do you wish to continue:
y
Enter your conversion type: 1->Octal to Decimal   2->Decimal to Octal
2
Enter the decimal number:
119
The octal number for 119 is 167


 */