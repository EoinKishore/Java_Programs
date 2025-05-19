// 	Print the prime digit from the given number
import java.util.Scanner;
class Program6 {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String res = findPrimeDigits(n);
        System.out.print("The result is " + res);
    }
    public static String findPrimeDigits(int n) {
        StringBuilder sb = new StringBuilder();
        int temp = n;
        while(temp > 0) {
            int lastDigit = temp % 10;
            if(!(checkIsPrimeOrNot(lastDigit))) {
                sb.append(lastDigit);
            }
            temp /= 10;
        }
        return sb.reverse().toString();
    }
    public static boolean checkIsPrimeOrNot(int num) {
        boolean flag = false;
        if(num == 0 || num == 1) {
            flag = true;
            return flag;
        }
        for(int i = 2; i<num/2; i++) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
// Enter the number :
// 25863
// The result is 352