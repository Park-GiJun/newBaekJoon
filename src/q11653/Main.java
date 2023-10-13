package q11653;

//정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		factorize(n, bw);

		bw.flush();
		bw.close();
		br.close();
	}

	public static void factorize(int n, BufferedWriter bw) throws IOException {
		int i = 2;

		while (n > 1) {
			if (n % i == 0) {
				bw.write(String.valueOf(i) + "\n");
				n = n / i;
			} else {
				i++;
			}
		}
	}
}
