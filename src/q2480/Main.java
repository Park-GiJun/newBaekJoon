package q2480;

//1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//
//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (a != b && b != c && a != c) { // 3개 다 다른 경우
			int max = max(a, b);
			max = max(max, c);
			bw.write(String.valueOf(max * 100));
		} else if (a == b && b == c) { // 3개 다 같은 경우
			bw.write(String.valueOf((10000 + a * 1000)));
		} else if (a == b && b != c || a != b && b == c || a == c && a != b) { // 2개만 같은 경우
			int find = find(a, b, c);
			bw.write(String.valueOf((1000 + find * 100)));
		}

		bw.flush();
		bw.close();
		br.close();

	}

	private static int max(int a, int b) { // 가장 큰 수

		if (a < b) {
			a = b;
		}
		return a;
	}

	private static int find(int a, int b, int c) { // 2개만 같을 때 같은 수 찾기
		int find = 0;

		if (a == b && b != c) {
			find = a;
		} else if (a != b && b == c) {
			find = b;
		} else if (a == c && a != b) {
			find = a;
		}

		return find;
	}

}
