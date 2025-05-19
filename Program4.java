// print the Even digits from given number
import java.util.Scanner;
class Problem4
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        // PrintEvenDigits(n);
        // PrintEvenDigits2(n);
        PrintEvenDigits3(n); 
    }
    // Method - 1 
    public static void PrintEvenDigits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            int lastDigit = n%10;
            if(lastDigit%2 == 0) {
                sb.append(lastDigit);
            }
            n /= 10;
        }
        String str = sb.toString();
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    // Method - 2 
    public static void PrintEvenDigits2(int n) {
        String str = Integer.toString(n);
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            int digit = ch - '0';
            if(digit % 2 == 0) {
                System.out.print(digit+" ");
            }
        }
    }
    // Method - 3
    public static void PrintEvenDigits3(int n) {
        n = Math.abs(n);
        if (n == 0) return;
        int lastDigit = n % 10;
        PrintEvenDigits(n / 10);
        if (lastDigit % 2 == 0) {
            System.out.print(lastDigit + " ");
        }
    }
}
// Enter the number :
// 96325871
// 6 2 8