import java.util.*;
import java.text.*;
public class DatePaliAmbi
{
    public static void main(String[] args)
    {
        Date thisDate=new Date();
        SimpleDateFormat df=new SimpleDateFormat("ddMMy");
        long ori= Long.parseLong(df.format(thisDate));
        long number=ori;
        long number1=0;
        while (number>0)
        {
            long rem=number%10;
            number1=(number1*10)+rem;
            number=number/10;
        }
        if(ori==number1)
        {
            System.out.println("Today's Date "+number1+" is Palindrome");
        }
        else
        {
            System.out.println("Today's Date "+number1+" is not a Palindrome");
        }
    }
}
/*
Output:
Today's Date 22022022 is Palindrome
 */