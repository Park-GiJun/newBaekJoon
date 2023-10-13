package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int sum = 1;
		int cnt = 1;

		for (int i = 1; sum < n; i++) {
			sum += i * 6;
			cnt++;
		}

		System.out.println(cnt);

	}

}
