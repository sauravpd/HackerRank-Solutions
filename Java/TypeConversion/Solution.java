package TypeConversion;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try {
			String s = String.valueOf(n);

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}