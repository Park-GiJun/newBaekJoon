package q2563;

//가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
//
//
//
//예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] xY = new int[100][100];
		int cntOne = 0;
		int cntOver = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				xY[i][j] = 0;
			}
		}

		int cnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xx = Integer.parseInt(st.nextToken());
			int yy = Integer.parseInt(st.nextToken());
			for (int k = 0; k < 10; k++) {
				for (int l = 0; l < 10; l++) {
					xY[xx + k][yy + l]++;
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (xY[i][j] == 1) {
					cntOne++;
				} else if (xY[i][j] > 1) {
					cntOver++;
				}
			}
		}
		bw.write(String.valueOf(cntOne+cntOver));
		bw.flush();
		bw.close();
		br.close();

	}
}
