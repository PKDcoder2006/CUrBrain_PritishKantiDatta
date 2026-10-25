import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final long MOD = 1000000007L;

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        long result = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();
            result = (result + value % MOD) % MOD;
        }

        System.out.println("Sum modulo " + MOD + " = " + result);

        sc.close();
    }
}