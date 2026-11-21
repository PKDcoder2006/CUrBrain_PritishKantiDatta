
import java.util.Scanner;
public class Q20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        if(n != 0)
        {
            int arr[] = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
            int sum = 0, tmp;
            for(int i = n-1 ; i >= 0 ; i--)
            {
             tmp = arr[i];
             arr[i] = sum;
             sum += tmp;
            }
            System.out.println("Array after in-place sum : ");
            for (int i = 0; i < n; i++)
             System.out.print(arr[i] + " ");
        }
        else
            System.out.println("Array is empty");
    }
}