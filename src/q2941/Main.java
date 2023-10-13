package q2941;

//예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//
//dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine();
		int b = 0;
		int i = 0;
		while (i < a.length()) {
			char currentChar = a.charAt(i);
			if (currentChar == 'c' && i < a.length() - 1) {
				char nextChar = a.charAt(i + 1);
				if (nextChar == '=' || nextChar == '-') {
					b++;
					i += 2; // 'c='나 'c-'는 한 글자로 처리
				} else {
					b++;
					i++;
				}
			} else if (currentChar == 'd' && i < a.length() - 1) {
				char nextChar = a.charAt(i + 1);
				if (nextChar == 'z' && i < a.length() - 2 && a.charAt(i + 2) == '=') {
					b++;
					i += 3; // 'dz='는 한 글자로 처리
				} else if (nextChar == '-') {
					b++;
					i += 2; // 'd-'는 한 글자로 처리
				} else {
					b++;
					i++;
				}
			} else if ((currentChar == 's' || currentChar == 'z') && i < a.length() - 1) {
				char nextChar = a.charAt(i + 1);
				if (nextChar == '=') {
					b++;
					i += 2; // 's='나 'z='는 한 글자로 처리
				} else {
					b++;
					i++;
				}
			} else if ((currentChar == 'l' || currentChar == 'n') && i < a.length() - 1) {
				char nextChar = a.charAt(i + 1);
				if (nextChar == 'j') {
					b++;
					i += 2; // 'lj'나 'nj'는 한 글자로 처리
				} else {
					b++;
					i++;
				}
			} else {
				b++;
				i++;
			}
		}
		bw.write(String.valueOf(b));
		bw.flush();
		bw.close();
		br.close();
	}
}
