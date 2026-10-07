import java.util.*;
public class Q9 {
    static boolean isPrime(int k)
    {
        for(int i = 2 ; i < k ; i++)
            if(k%i == 0)
                return false;
        return true;
    }
    static int nxtPrime(int n)
    {
        int i;
        if(n < 2)
            return 2;
        i = n+1;
        while(!(isPrime(i)))
              i++;
        return i;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        System.out.println(nxtPrime(scan.nextInt()));
    }
}