import java.util.*;
// Program to print bitwise operator
public class BitwiseOp
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter X: ");
        int x= scan.nextInt();
        System.out.println("Enter Y: ");
        int y= scan.nextInt();
        int x1=x,y1=y;
        int rem,result=0;
        String binary1="";
        String binary2="";
        String result1="";
        System.out.print("Binary for "+x+" is ");
        while(x>0)
        {
            rem=x%2;
            binary1=rem+binary1;
            x=x/2;
        }
        x=x1;
        System.out.println(binary1);
        System.out.print("Binary for "+y+" is ");
        while(y>0)
        {
            rem=y%2;
            binary2=rem+binary2;
            y=y/2;
        }
        y=y1;
        System.out.println(binary2);
        // Bitwise AND
        result=x&y;
        while(result>0)
        {
            rem=result%2;
            result1=rem+result1;
            result=result/2;
        }
        System.out.println("Bitwise AND: "+ "\n"+binary1+"\n"+binary2+"\n------\n"+result1+"\n------");
        // Bitwise Exclusive OR
        result=x^y;
        System.out.println("Bitwise Exclusive OR: "+"\n"+binary1+"\n"+binary2+"\n------\n"+Integer.toBinaryString(result)+"\n------");
        // Bitwise Inclusive OR
        result=x|y;
        System.out.println("Bitwise Inclusive OR: "+"\n"+binary1+"\n"+binary2+"\n------\n"+Integer.toBinaryString(result)+"\n------");
        // Bitwise Complement
        System.out.println("Bitwise Complement: "+ Integer.toBinaryString(~x));
        // Bitwise Left Shift
        result=x<<y;
        System.out.println("Bitwise Left Shift: "+ Integer.toBinaryString(result));
        // Bitwise Right Shift
        result=x>>y;
        System.out.println("Bitwise Right Shift: "+ Integer.toBinaryString(result));
        // Bitwise Unsigned Right Shift
        result=x>>>2;
        System.out.println("Bitwise Unsigned Right Shift: "+ Integer.toBinaryString(result));
    }
}
/*
Output:

Enter X:
23
Enter Y:
56
Binary for 23 is 10111
Binary for 56 is 111000
Bitwise AND:
10111
111000
------
10000
------
Bitwise Exclusive OR:
10111
111000
------
101111
------
Bitwise Inclusive OR:
10111
111000
------
111111
------
Bitwise Complement: 11111111111111111111111111101000
Bitwise Left Shift: 10111000000000000000000000000
Bitwise Right Shift: 0
Bitwise Unsigned Right Shift: 101

 */