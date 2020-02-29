package Day_1;

import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int n1=scan.nextInt();
        double d1=scan.nextDouble();
        scan.nextLine();
        String s1=scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println(i+n1);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(d+d1);
        /* Print the sum of the double variables on a new line. */
		System.out.println(s+s1);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}