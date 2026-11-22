
import java.util.Scanner;
public class Q22
{
    static int arr1[], arr2[], m, n;
    static void mergeInPlace()
    {
        int i = m-1, j = n-1, k = m+n-1;
        while(i >= 0 && j >= 0)
        {
            if(arr1[i] > arr2[j])
                arr1[k] = arr1[i--];
            else
                arr1[k] = arr2[j--];
            k--;
        }
        while(j >= 0)
        {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        m = sc.nextInt();
        System.out.println("Enter the size of second array : ");
        n = sc.nextInt();
        arr1 = new int[m+n];
        arr2 = new int[n];
        if(m != 0)
        {
            System.out.println("Enter first array elements:");
            for (int i = 0; i < m; i++)
             arr1[i] = sc.nextInt();
        }
        if(n != 0)
        {
            System.out.println("Enter second array elements:");
            for (int i = 0; i < n; i++)
             arr2[i] = sc.nextInt();
        }
        for(int i = m; i < m+n; i++)
         arr1[i] = 0;
        mergeInPlace();
        System.out.println("Array after merging : ");
        for(int i = 0; i < m+n; i++)
         System.out.print(arr1[i] + " ");
    }
}