//Reverse the Array - Method - 1
import java.util.*;
class Program1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total numbers : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("The reversed numbers are :");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
// Enter total numbers :
// 5
// Enter the numbers :
// 1 2 3 4 5
// The reversed numbers are :
// 5 4 3 2 1