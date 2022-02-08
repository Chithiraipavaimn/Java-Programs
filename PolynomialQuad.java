import java.util.*;
/*
 Program to evaluate to polynomial equation
  ax^2+bx+c=0;
   using quadratic formula
 */
public class PolynomialQuad
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=scan.nextDouble();
        System.out.println("Enter b: ");
        double b= scan.nextDouble();
        System.out.println("Enter c: ");
        double c= scan.nextDouble();
        double valueadd, valuesub;
        // Quadratic equation
        double multiply=b*b-4*a*c;
        valueadd= (-b + Math.sqrt(multiply))/(2*a);
        System.out.println("Value of X1 is: "+valueadd);
        valuesub= (-b - Math.sqrt(multiply))/(2*a);
        System.out.println("Value of X2 is: "+valuesub);

        // Polynomial equation
        valueadd=(a*valueadd*valueadd)+(b*valueadd)+c;
        valuesub=(a*valuesub*valuesub)+(b*valuesub)+c;
        if(valueadd==0 && valuesub==0)
        {
            System.out.println("The given equation is polynomial");
        }
        else
        {
            System.out.println("The given equation is not a polynomial.");
        }


    }
}
/*

Output:

Enter a:
1
Enter b:
5
Enter c:
6
Value of X1 is: -2.0
Value of X2 is: -3.0
The given equation is polynomial

 */