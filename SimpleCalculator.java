import java.util.*;
//  Program to write Simple Calculator
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        long a= scan.nextLong();
        System.out.println("Enter b: ");
        long b= scan.nextLong();
        long c = 0;
        int no;
        char ch;
        do
        {
            System.out.println("Enter your choice 1->add 2->sub 3->multiply 4->Divide: ");
            no= scan.nextInt();
            switch (no)
            {
                case 1:
                    c = a + b;
                    System.out.println(c);
                    break;
                case 2:
                    c = a - b;
                    System.out.println(c);
                    break;
                case 3:
                    c = a * b;
                    System.out.println(c);
                    break;
                case 4:
                    c = a / b;
                    System.out.println(c);
                    break;
                default:
                    System.exit(0);
            }
            System.out.println("Do you wish to continue: ");
            ch=scan.next().charAt(0);
            if(ch=='y')
            {
                a=c;
                System.out.println("Enter your number: ");
                b= scan.nextLong();
            }
        }while(ch=='y');
    }
}
/*

Output:

Enter a:
2
Enter b:
3
Enter your choice 1->add 2->sub 3->multiply 4->Divide:
1
5
Do you wish to continue:
y
Enter your number:
6
Enter your choice 1->add 2->sub 3->multiply 4->Divide:
3
30
Do you wish to continue:
y
Enter your number:
5
Enter your choice 1->add 2->sub 3->multiply 4->Divide:
4
6
Do you wish to continue:
y
Enter your number:
1
Enter your choice 1->add 2->sub 3->multiply 4->Divide:
2
5
Do you wish to continue:
n

 */