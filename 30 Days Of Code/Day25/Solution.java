package Day25;
import java.util.Scanner;

public class Solution {
  static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] expectedDate = sc.next().split(" ");
        String[] dueDate = sc.next().split(" ");
        int D1=Integer.parseInt(expectedDate[0]),M1=Integer.parseInt(expectedDate[1]),Y1=Integer.parseInt(expectedDate[2]);
        int D2=Integer.parseInt(dueDate[0]),M2=Integer.parseInt(dueDate[1]),Y2=Integer.parseInt(dueDate[2]);
        
        for (int i = 0; i < n; i++) {
            String result = isPrime(sc.nextInt()) ? "Prime" : "Not prime";
            System.out.println(result);
        }
        sc.close();
    }
}

