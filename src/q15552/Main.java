package q15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			String s = br.readLine();
			int num1 = Integer.parseInt(s.split(" ")[0]);
			int num2 = Integer.parseInt(s.split(" ")[1]);
			bw.write(num1 + num2 + "\n");
		}

		br.close();
		bw.flush();
		bw.close();

	}

}
