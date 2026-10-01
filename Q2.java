import java.util.*;
public class Q2
{
    static int revDbl(int n)
    {
        int rev = 0;
        while(n != 0)
        {
            rev = rev*10 + n%10;
            n /= 10;
        }
        return rev*2;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        System.out.println(revDbl(scan.nextInt()));
    }
}