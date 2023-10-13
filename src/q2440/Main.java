package q2440;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int x = 0; x < N - i; x++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}
}
