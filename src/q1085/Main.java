package q1085;

import java.io.*;
import java.util.*;

//한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
//직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int a1 = x < (w - x) ? x : (w - x);
		int a2 = y < (h - y) ? y : (h - y);

		if (a1 > a2) {
			bw.write(String.valueOf(a2));
		} else {
			bw.write(String.valueOf(a1));
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
