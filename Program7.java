// reverse the number
import java.util.Scanner;
class Program7 {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverseTheNumber2(n);
    }
    // method -1
    public static void reverseTheNumber1(int n) {
        String str = Integer.toString(n);
        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    // method - 2
    public static void reverseTheNumber2(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        System.out.print(sb.reverse().toString());
    }
    // method - 3
    public static void reverseTheNumber3(int n) {
        if(n == 0) {
            return;
        }
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        reverseTheNumber3(n/10);
    }    
}
// Enter the number : 
// 5632
// 2365