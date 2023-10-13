package q5073;

//삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
//
//Equilateral :  세 변의 길이가 모두 같은 경우
//Isosceles : 두 변의 길이만 같은 경우
//Scalene : 세 변의 길이가 모두 다른 경우
//단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 
//예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
//세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean fin = true;
		StringBuilder sb = new StringBuilder();

		while (fin) {
			int max = 0;
			int cnt = 0;
			int[] arr = new int[3];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < 3; i++) {
				max = Math.max(max, arr[i]);
			}

			for (int i = 0; i < 3; i++) {
				if (max == arr[i]) {
					cnt = i;
				}
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			if (max >= arr[(cnt + 1) % 3] + arr[(cnt + 2) % 3]) {
				sb.append("Invalid\n");
			} else {
				if (arr[0] == arr[1] && arr[1] == arr[2]) {
					sb.append("Equilateral\n");
				} else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
					sb.append("Isosceles\n");
				} else {
					sb.append("Scalene\n");
				}
			}

		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();

	}

}
