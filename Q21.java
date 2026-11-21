
import java.util.Scanner;
public class Q21
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
            System.out.println("Enter the target:");
            int target = sc.nextInt();
            boolean found = false;
            for(int i = 0 ; i < n-1 ; i++)
            {
                if(arr[i] == target)
                 found = true;
                if(found)
                 arr[i] = arr[i+1];
            }
            if(found)
            {
                System.out.println("Array after deletion of target : ");
                for (int i = 0; i < n-1; i++)
                 System.out.print(arr[i] + " ");
            }
            else
                System.out.println("Target not found; array unchanged");
        }
        else
            System.out.println("Array is empty");
    }
}