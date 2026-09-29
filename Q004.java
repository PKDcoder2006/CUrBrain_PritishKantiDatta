import java.util.*;
public class ProdSumDiff
{
    static int diff(int n)
    {
        int prod = 1, sum = 0;
        while(n != 0)
        {
            sum += n%10;
            prod *= n%10;
            n /= 10;
        }
        return prod-sum;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int k = scan.nextInt();
        if(k > 0)
         System.out.println(diff(k));
    }
}