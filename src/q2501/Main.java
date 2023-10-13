package q2501;

//어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다. 
//
//6을 예로 들면
//
//6 ÷ 1 = 6 … 0
//6 ÷ 2 = 3 … 0
//6 ÷ 3 = 2 … 0
//6 ÷ 4 = 1 … 2
//6 ÷ 5 = 1 … 1
//6 ÷ 6 = 1 … 0
//그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
//
//두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.

import java.util.*;
import java.io.*;

public class Main {

	public static <Intger> void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		boolean c = true;
		int[] ans = new int[a + 1];
		int num = 0;

		for (int i = 1; i <= a; i++) {
			if (b % i == 0) {
				ans[num++] = i;
			}
		}
		while (c) {
			if (ans[a] == 0) {
				a--;
			} else {
				System.out.println(ans[a]);
				c = false;
			}

		}
	}

}
