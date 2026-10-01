import java.util.*;
public class Q3
{
    static int flip(int n)
    {
        int rev = 0;
        while(n != 0)
        {
            rev = rev*10 + n%10;
            n /= 10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int k = scan.nextInt();
        int rvrs = flip(k);
        if(rvrs == k && k > 0)
         System.out.println(k);
        else
         System.out.println(rvrs+k);
    }
}