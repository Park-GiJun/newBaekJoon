package q1436;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int count = 0;
		int number = 0;

		while (count < n) {
			number++;
			if (String.valueOf(number).contains("666")) {
				count++;
			}
		}

		bw.write(String.valueOf(number));
		bw.flush();

		br.close();
		bw.close();
	}
}
