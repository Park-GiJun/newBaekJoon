package q5597;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[30];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		for (int i = 0; i < 28; i++) {
			int j = Integer.parseInt(br.readLine());
			arr[j - 1] = j;
		}
		for (int i = 0; i < 30; i++) {
			if (arr[i] == 0) {
				bw.write(String.valueOf(i + 1));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		br.close();

	}

}
