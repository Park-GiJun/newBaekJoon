package q10809;

//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		int[] positions = new int[26];

		for (int i = 0; i < 26; i++) {
			positions[i] = -1;
		}

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			int index = c - 'a';
			if (positions[index] == -1) {
				positions[index] = i;
			}
		}
		for (int i = 0; i < 26; i++) {
			bw.write(positions[i] + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
