package q14425;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Set<String> set1 = new HashSet<>();

		for (int i = 0; i < n; i++) {
			String inp = br.readLine();
			set1.add(inp);
		}

		int cnt = 0;

		for (int i = 0; i < m; i++) {
			String inp = br.readLine();
			if (set1.contains(inp)) {
				cnt++;
			}
		}

		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}
}
