import java.util.*;
//Program to print the area of space between two concentric circle
public class ConcentricCircle
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Radius of Outer circle: ");
        float Outer= scan.nextFloat();
        System.out.println("Radius of Inner circle: ");
        float Inner= scan.nextFloat();
        final float pie=3.14f;
        float Area;
        Outer=pie*Outer*Outer;
        Inner=pie*Inner*Inner;
        Area=Outer-Inner;
        System.out.println("Area of Space: "+Area);
    }
}
/*

Output:
Radius of Outer circle:
22
Radius of Inner circle:
18
Area of Space: 502.40002


 */