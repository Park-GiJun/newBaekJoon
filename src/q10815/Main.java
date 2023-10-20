package q10815;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		HashMap<Integer, Boolean> mapN = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			mapN.put(Integer.parseInt(st.nextToken()), true);
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (mapN.containsKey(num)) {
				bw.write("1 ");
			} else {
				bw.write("0 ");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
