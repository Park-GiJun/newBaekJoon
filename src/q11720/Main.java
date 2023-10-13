package q11720;

//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		String numbers = br.readLine();
		int sum = 0;

		for (int i = 0; i < a; i++) {
			char b = numbers.charAt(i);
			int num = Character.getNumericValue(b);
			sum += num;
		}

		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
