package q1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		ArrayList<String> arrList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (!arrList.contains(str)) { 
				arrList.add(str);
			}
		}

		Collections.sort(arrList, new Comparator<>() {
			@Override
			public int compare(String str1, String str2) {
				if (str1.length() == str2.length()) {
					return str1.compareTo(str2);
				} else {
					return Integer.compare(str1.length(), str2.length());
				}
			}
		});

		for (String str : arrList) {
			bw.write(str + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
