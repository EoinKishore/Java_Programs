//	Check the given number is Prime number or not
import java.util.Scanner;
class Program5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        boolean res = isPrimeOrNot(n);
        if(!res) {
            System.out.print(n + " is a Prime Number");
        }
        else {
            System.out.print(n + " is Not a Prime Number");
        }
    }
    public static boolean isPrimeOrNot(int n){
        boolean flag = false;
        if(n == 0 || n== 1) {
            flag = true;
            return flag;
        }
        for(int i=2;i < n/2; i++) {
            if( n % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
// Input
// Enter the number : 
// 5
// Output :
// 5 is a Prime Number