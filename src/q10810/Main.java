package q10810;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		for (int a = 0; a < m; a++) {
			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			for (int b = i - 1; b < j; b++) {
				arr[b] = k;
			}
		}
		for (int c = 0; c < arr.length; c++) {
			bw.write(arr[c] + " "); 				// String.ValueOf

		}
		bw.flush();
		bw.close();
		br.close();
	}
}