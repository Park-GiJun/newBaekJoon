package q2581;

//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<Integer>();

		int sum = 0;

		// 소수 찾기
		for (; m <= n; m++) {
			if (isPrime(m)) {
				list.add(m);
			}

		}

		// 합과 최솟값
		for (int num : list) {
			sum += num;
		}

		if (sum == 0) {
			sum = -1;
		}
		bw.write(String.valueOf(sum));
		bw.newLine();
		if (!list.isEmpty()) {
			bw.write(String.valueOf(list.get(0)));
		}
		bw.flush();
		bw.close();
		br.close();

	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

}
