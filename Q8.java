import java.util.*;
public class Q8 {
    static int kthfctr(int n, int pos)
    {
        int cnt = 0, arr[] = new int[n];
        for(int i = 1; i <= Math.sqrt(n) ; i++)
            if(n%i == 0)
                arr[cnt++] = i;
        int cnt2 = cnt;
        for(int i = cnt ; i < cnt*2 ; i++)
            if(arr[cnt*2-i-1]*arr[cnt*2-i-1] != n)
             arr[cnt2++] = n/arr[cnt*2-i-1];
        if(pos > cnt2)
            return -1;
        else
            return arr[pos-1];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number and then k : ");
        System.out.println(kthfctr(scan.nextInt(), scan.nextInt()));
    }
}