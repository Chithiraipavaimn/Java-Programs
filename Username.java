import java.util.*;
// Program to generate username manually
public class Username
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fname=scan.next();
        System.out.println("Enter your last name: ");
        String lname=scan.next();
        System.out.println("Enter your mobile number: ");
        String mobile_no=scan.next();
        System.out.println("Enter N: ");
        int N=scan.nextInt();
        String l=lname.toLowerCase(),f=fname.toLowerCase();
        if(fname.length()<lname.length())
        {
            // l= lname.toLowerCase();
            System.out.print(l.charAt(0));
            //f=fname.toUpperCase();
            System.out.print(f);
        }
        else if(fname.length()>lname.length())
        {
            //f= fname.toLowerCase();
            System.out.print(f.charAt(0));
            // l=lname.toUpperCase();
            System.out.print(l);
        }
        else
        {
            if(f.charAt(0)<l.charAt(0))
            {
                //f=fname.toLowerCase();
                System.out.print(f.charAt(0));
                //l=lname.toUpperCase();
                System.out.print(l);
            }
            else
            {
                //l=lname.toLowerCase();
                System.out.print(l.charAt(0));
               // f=fname.toUpperCase();
                System.out.print(f);
            }
        }
        System.out.print(mobile_no.charAt(N-1));
        N=mobile_no.length()-N;
        System.out.print(mobile_no.charAt(N));
    }
}
/*
Output:
Enter your first name:
Sameera
Enter your last name:
Sherif
Enter your mobile number:
1234567890
Enter N:
4
ssherif47
 */