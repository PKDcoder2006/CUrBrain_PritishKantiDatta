import java.util.*;
public class Q10 {
    static int sieving(int n)
    {
        boolean arr[] = new boolean[n+1];
        for(int i = 2 ; i <= n; i++)
            arr[i] = true;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
            {
                if(arr[i])
                 for(int j = i*2; j <= n ; j += i)
                    arr[j] = false;
            }
        int cnt = 0;
        for(int i = 2 ; i < n ; i++)
            if(arr[i])
                cnt++;
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        System.out.println(sieving(scan.nextInt()));
    }
}