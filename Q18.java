import java.util.*;
public class Q18
{
    public static void main(String args[])
    {
        System.out.println("Enter the array size : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        System.out.println("Enter the start and end indices : ");
        int start = scan.nextInt(), end = scan.nextInt();
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}