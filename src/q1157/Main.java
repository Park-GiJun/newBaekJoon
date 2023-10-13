package q1157;

//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine().toUpperCase(); // 입력 문자열을 대문자로 변환
		int[] frequency = new int[52]; // 대문자와 소문자 알파벳을 고려한 배열 크기

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if ('A' <= c && c <= 'Z') { // 대문자 알파벳일 경우
				frequency[c - 'A']++;
			} else if ('a' <= c && c <= 'z') { // 소문자 알파벳일 경우
				frequency[c - 'a' + 26]++;
			}
		}

		int maxFrequency = 0;
		char mostFrequentChar = '?';

		for (int i = 0; i < 52; i++) {
			if (frequency[i] > maxFrequency) {
				maxFrequency = frequency[i];
				if (i < 26) {
					mostFrequentChar = (char) ('A' + i);
				} else {
					mostFrequentChar = (char) ('a' + i - 26);
				}
			} else if (frequency[i] == maxFrequency) {
				mostFrequentChar = '?'; // 최댓값이 중복될 경우
			}
		}

		bw.write(mostFrequentChar);
		bw.flush();
		bw.close();
		br.close();
	}
}
