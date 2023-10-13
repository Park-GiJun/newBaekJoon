package q1316;

//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
//예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int time = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 0; i < time; i++) {
			String word = br.readLine();
			boolean[] check = new boolean[26]; // 알파벳 소문자만 고려
			boolean isGroupWord = true;
			char pre = 0;

			for (char now : word.toCharArray()) {
				if (now != pre) { // 현재 문자가 이전 문자와 다를 때
					if (check[now - 'a'] == false) {
						check[now - 'a'] = true;
						pre = now;
					} else {
						isGroupWord = false;
						break;
					}
				}
			}

			if (isGroupWord) {
				cnt++;
			}

		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}

}
