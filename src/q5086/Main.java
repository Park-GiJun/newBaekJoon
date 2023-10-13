package q5086;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<String> answers = new ArrayList<String>();
		boolean set = true;
		while (set) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0) {
				set = false;
			} else if (b > a) {
				if (b % a == 0) {
					answers.add("factor");
				} else {
					answers.add("neither");
				}
			} else if (a > b) {
				if (a % b == 0) {
					answers.add("multiple");
				} else {
					answers.add("neither");
				}
			} else {
				answers.add("neither");
			}
		}

		for (String answer : answers) {
			bw.write(answer);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
