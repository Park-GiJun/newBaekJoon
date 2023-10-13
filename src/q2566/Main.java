package q2566;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] arr = new int[9][9];
		int a = -1;
		int c = 0;
		int d = 0;

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (a < arr[i][j]) {
					a = arr[i][j];
					c = i + 1;
					d = j + 1;
				}

			}
		}
		bw.write(String.valueOf(a));
		bw.newLine();
		bw.write(String.valueOf(c + " "));
		bw.write(String.valueOf(d));
		bw.flush();
		bw.close();
		br.close();
	}

}
