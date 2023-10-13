package q9506;

//어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
//
//예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
//
//n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

//입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)
//
//입력의 마지막엔 -1이 주어진다.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == -1) {
				break;
			}

			int sum = 0;
			List<Integer> divisors = new ArrayList<>();

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
					divisors.add(i);
				}
			}

			if (sum == n) {
				bw.write(n + " = ");
				for (int i = 0; i < divisors.size(); i++) {
					if (i > 0) {
						bw.write(" + ");
					}
					bw.write(String.valueOf(divisors.get(i)));
				}
				bw.write("\n");
			} else {
				bw.write(n + " is NOT perfect.\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
