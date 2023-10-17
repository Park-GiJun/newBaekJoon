package q10814;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		List<String[]> people = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			people.add(new String[] { age + "", name });
		}

		Collections.sort(people, (p1, p2) -> Integer.compare(Integer.parseInt(p1[0]), Integer.parseInt(p2[0])));

		for (String[] person : people) {
			bw.write(person[0] + " " + person[1] + "\n");
		}

		br.close();
		bw.close();
	}
}
