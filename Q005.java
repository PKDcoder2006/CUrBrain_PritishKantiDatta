import java.util.*;
public class EvenZeroList
{
    static int digitCalc(int n)
    {
        int digs = 0;
        while(n != 0)
        {
            digs++;
            n /= 10;
        }
        return digs;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int k = scan.nextInt();
        if(k > 0)
        {
            int digs = digitCalc(k);
            int arr[] = new int[digs];
            for(int i = 0 ; i < digs ; i++)
            {
                int d = k%10;
                if(d%2 == 0)
                 arr[i] = 0;
                else
                 arr[i] = d;
                k /= 10;
            }
            for(int i = digs-1 ; i >= 0 ; i--)
             System.out.print(arr[i] + " ");
        }
    }
}