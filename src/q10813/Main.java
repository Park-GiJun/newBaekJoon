package q10813;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for (int e = 0; e < arr.length; e++) {
			arr[e] = e + 1;
		}

		int m = Integer.parseInt(st.nextToken());

		for (int a = 0; a < m; a++) {
			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int c = 0;
			c = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = c;
		}

		for (int d = 0; d < arr.length; d++) {
			bw.write(arr[d] + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
