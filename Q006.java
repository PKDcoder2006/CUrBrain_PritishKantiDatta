import java.util.*;
public class Abs_Diff
{
    static int abs_diff(int n, int a, int b)
    {
        int cnt_A = 0, cnt_B = 0;
        do
        {
            int dig = n%10;
            if(dig == a)
             cnt_A++;
            if(dig == b)
             cnt_B++;
            n /= 10;
        }
        while(n != 0);
        return Math.abs(cnt_A-cnt_B);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number, a, b : ");
        int k = scan.nextInt(), a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        if(k >= 0 && a >= 0 && b >= 0 && a <= 9 && b <= 9)
         System.out.println(abs_diff(k, a, b));
    }
}