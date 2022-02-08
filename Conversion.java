import java.util.*;
// Program to find the conversion

public class Conversion
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        // km to miles, miles to km
        System.out.println("km: ");
        double km= scan.nextDouble();
        System.out.println("Distance km to miles: "+ (km*0.621371));
        System.out.println("miles: ");
        double miles= scan.nextDouble();
        System.out.println("Distance miles to km: "+ (miles*1.60934));

        // centigrade to fahrenheit, fahrenheit to centigrade
        System.out.println("Celsius: ");
        double C= scan.nextDouble();
        System.out.println("Temperature C to F: "+ ((C*9/5)+32));
        System.out.println("Fahrenheit: ");
        double F= scan.nextDouble();
        System.out.println("Temperature F to C: "+ ((F-32)*5)/9);

        // sqft to acre, acre to sqft
        System.out.println("Sqft: ");
        double ft= scan.nextDouble();
        System.out.println("Land sqft to acre: "+ (ft/43560));
        System.out.println("Acre: ");
        double acre= scan.nextDouble();
        System.out.println("Land acre to sqft: "+ 43560*acre);


    }
}
/*

Output:


km:
20
Distance km to miles: 12.42742
miles:
20
Distance miles to km: 32.1868
Celsius:
13
Temperature C to F: 55.4
Fahrenheit:
43
Temperature F to C: 6.111111111111111
Sqft:
1
Land sqft to acre: 2.295684113865932E-5
Acre:
2
Land acre to sqft: 87120.0




 */