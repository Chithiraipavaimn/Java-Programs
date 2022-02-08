
import java.text.DecimalFormat;
import java.util.*;
// Program to find the roots of quadratic equation
public class RootsOFQuadratic
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a= scan.nextDouble();
        System.out.println("Enter b: ");
        double b= scan.nextDouble();
        System.out.println("Enter c: ");
        double c= scan.nextDouble();
        double x1,x2;
        DecimalFormat df=new DecimalFormat();
        double multiply=b*b-4*a*c;
        if(multiply>0)
        {
            x1=(-b + Math.sqrt(multiply))/(2*a);
            x2=(-b - Math.sqrt(multiply))/(2*a);
            System.out.println("The roots are unequal and they are "+x1+ " and "+x2);
        }
        else if(multiply==0)
        {
            x1=-b/(2*a);
            x2=-b/(2*a);
            System.out.println("The roots are equal and they are "+x1+" and "+x2);
        }
        else
        {
            x1=-b/(2*a);
            x2=Math.sqrt(-multiply)/(2*a);
            System.out.printf("The roots are imaginary. The real and imaginary part and they are "+df.format(x1)+"+"+df.format(x2)+"i  and  ");
            System.out.printf(df.format(x1)+"-"+df.format(x2)+"i");
        }
    }
}
/*

Output:

Enter a:
2.3
Enter b:
4
Enter c:
5.6
The roots are imaginary. The real and imaginary part and they are -0.87+1.296i  and  -0.87-1.296i

 */