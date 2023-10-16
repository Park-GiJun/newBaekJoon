package q25305;
//2022 연세대학교 미래캠퍼스 에 
//N명의 학생들이 응시했다.
//
//이들 중 점수가 가장 높은 
//k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
//
//커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		bw.write(String.valueOf(arr[n-k]));
		bw.flush();
		bw.close();
		br.close();
	}
}
