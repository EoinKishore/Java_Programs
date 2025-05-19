// print the Even digits from given number
// the number will print in reverse order
import java.util.Scanner;
class Problem1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ente the number : ");
        int n = s.nextInt();
        PrintEvenDigits(n);
    }
    public static void PrintEvenDigits(int n) {
        while(n > 0) {
            int lastDigit = n%10;
            if(lastDigit%2 == 0) {
                System.out.print(lastDigit+" ");
            }
            n /= 10;
        }
    }
}
// Enter the number :
// 98632241
// 4 2 2 6 8  → Output