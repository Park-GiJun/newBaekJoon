package q2338;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());

		bw.write(String.valueOf(a.add(b)));
		bw.newLine();
		bw.write(String.valueOf(a.subtract(b)));
		bw.newLine();
		bw.write(String.valueOf(a.multiply(b)));
		bw.flush();
		bw.close();
		br.close();
		
	}

}
