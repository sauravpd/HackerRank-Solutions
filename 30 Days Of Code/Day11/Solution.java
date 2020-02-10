package Day11;

import java.util.Scanner;

public class Solution {

       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                arr[row][col] = scan.nextInt();
            }
        }
        scan.close();
        
        System.out.println(maxHourglass(arr));
    }
    
    public static int maxHourglass(int [][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = findSum(arr, row, col);
                if(sum>max)
                {
                	max=sum;
                }
               
            }
        }
        return max;
    }
    
    private static int findSum(int [][] arr, int row, int col) {
        int sum = arr[row+0][col+0] + arr[row+0][col+1] + arr[row+0][col+2] 
                                + arr[row+1][col+1] + 
                  arr[row+2][col+0] + arr[row+2][col+1] + arr[row+2][col+2];
        return sum;
    }
}
