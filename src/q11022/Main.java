package q11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 0 ; i < a ; i++) {
			String s = br.readLine();
			int num1 = Integer.parseInt(s.split(" ")[0]);
			int num2 = Integer.parseInt(s.split(" ")[1]);
			int sum = num1 + num2;
			bw.write("Case #" + (i+1) + ": " + num1 + " + " + num2 + " = " + sum);
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
