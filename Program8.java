// Check the number is Palindrome or not
import java.util.Scanner;
class Program8 {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean res = isPalindromeOrNot(n);
        if(!res) {
            System.out.print("The number "+n+" is Palindrome");
        }
        else {
            System.out.print("The number "+n+" is not a Palindrome");
        }
    }
    public static boolean isPalindromeOrNot(int n) {
        String str = Integer.toString(n);
        int length = str.length();
        int start = 0, end = length - 1;
        boolean flag = false;
        while(start < end) {
            int startNum = str.charAt(start) - '0';
            int endNum = str.charAt(end) - '0';
            if(startNum != endNum) {
                flag = true;
                return flag;
            }
            start++;end--;
        }
        return flag;
    }
}
// Enter the number : 
// 123321
// The number 123321 is Palindrome