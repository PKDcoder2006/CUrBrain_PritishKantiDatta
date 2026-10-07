import java.util.*;
public class Q7 {
    static int gcd(int a, int b)
    {
        while(b != 0)
            {
                int rem = a%b;
                a = b;
                b = rem;
            }
        return a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size and then elements : ");
        int n = scan.nextInt(), arr[] = new int[n];
        for(int i = 0; i < n ; i++)
            arr[i] = scan.nextInt();
        int gc_d = arr[0];
        for(int i = 1 ; i < n ; i++)
            gc_d = gcd(Math.max(gc_d, arr[i]), Math.min(arr[i], gc_d));
        System.out.println(gc_d);
    }
}