package q10811;

//도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 
//
//도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
//
//바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		for (int a = 0; a <n; a++) {
			arr[a] = a+1;
		}

		for (int a = 0; a < m; a++) {
			st = new StringTokenizer(br.readLine());
			int i =0;
			int j=0;
			if(st.hasMoreTokens()) {
				 i = Integer.parseInt(st.nextToken());
				 j = Integer.parseInt(st.nextToken());
			}
			reverseArry(arr, i - 1, j - 1);
		}

		for (int a = 0; a < n; a++) {
			bw.write(String.valueOf(arr[a])+ " ");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

	public static void reverseArry(int[] arry, int startIndex, int endIndex) {
		while (startIndex < endIndex) {
			int temp = arry[startIndex];
			arry[startIndex] = arry[endIndex];
			arry[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}

}
