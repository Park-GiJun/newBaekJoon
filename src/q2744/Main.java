package q2744;

//영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		char[] inputChars = input.toCharArray();

		for (char c : inputChars) {
			if (Character.isUpperCase(c)) {
				bw.write(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				bw.write(Character.toUpperCase(c));
			} else {
				// 다른 문자 (공백, 특수 문자 등)은 그대로 출력
				bw.write(c);
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
