// print the individual digit
import java.util.Scanner;
class Problem2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PrintDigits(n);
    }
    public static void PrintDigits(int n) {
        String str = Integer.toString(n);
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
// 6893 → Input
// 6 8 9 3 → Output