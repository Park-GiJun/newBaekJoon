package q2562;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
//예를 들어, 서로 다른 9개의 자연수
//
//3, 29, 38, 12, 57, 74, 40, 85, 61
//
//이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 최대값 찾기

		int a = arr[0];
		int arryMax = 0;
		for (int i = 1; i < arr.length; i++)
			if (a < arr[i]) {
				a = arr[i];
				arryMax = i;
			}

		bw.write(String.valueOf(a));
		bw.newLine();
		bw.write(String.valueOf(arryMax + 1));
		bw.flush();
		bw.close();
		br.close();
	}

}
