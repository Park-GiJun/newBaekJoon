package q2798;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger n = BigInteger.valueOf(Long.parseLong(st.nextToken()));
		BigInteger m = BigInteger.valueOf(Long.parseLong(st.nextToken()));

		int[] arr = new int[Integer.parseInt(String.valueOf(n))];
		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		for (int i = 0; i < Integer.parseInt(String.valueOf(n)); i++) {
			for (int j = 1; j < Integer.parseInt(String.valueOf(n)); j++) {
				int sumA = arr[i] + arr[j];
				if (Integer.parseInt(String.valueOf(m)) == (sum - sumA)) {
					bw.write(String.valueOf(sum - sumA));
				}
			}
		}

		bw.flush();
		bw.close();
		br.close();

	}

}
