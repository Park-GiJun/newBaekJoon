package q10815;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		Map<Integer, Integer> mapN = new HashMap<>();
		Map<Integer, Integer> mapM = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			mapN.put(Integer.parseInt(st.nextToken()), i);
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= m; i++) {
			mapM.put(Integer.parseInt(st.nextToken()), i);
		}

		List<Integer> ans = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (mapN.get(i).equals(mapM.get(j))) {
					ans.add(1);
				} else {
					ans.add(0);
				}
			}
		}
		for (int num : ans) {
			bw.write(num + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
