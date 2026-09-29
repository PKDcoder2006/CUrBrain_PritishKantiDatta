import java.util.*;
public class countDigits
{
    static boolean countDigs(int n)
    {
        int digs = 0;
        if(n < 0)
         n = -n;
        do
        {
            digs++;
             n /= 10;
        }
        while(n != 0);
        return digs % 2 == 0;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        System.out.println(countDigs(scan.nextInt()));
    }
}