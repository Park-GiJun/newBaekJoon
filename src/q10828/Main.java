package q10828;

//정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//명령은 총 다섯 가지이다.
//
//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String inp = br.readLine();
			if (inp.startsWith("push")) {
				StringTokenizer st = new StringTokenizer(inp);
				st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				list.add(0, num);
			} else {
				switch (inp) {
				case "pop":
					if (list.isEmpty()) {
						bw.write("-1");
						bw.newLine();
					} else {
						bw.write(String.valueOf(list.remove(0)));
						bw.newLine();
					}
					break;
				case "size":
					bw.write(String.valueOf(list.size()));
					bw.newLine();
					break;
				case "empty":
					if (list.isEmpty()) {
						bw.write("1");
						bw.newLine();
					} else {
						bw.write("0");
						bw.newLine();
					}
					break;
				case "top":
					if (list.isEmpty()) {
						bw.write("-1");
						bw.newLine();
					} else {
						bw.write(String.valueOf(list.get(0)));
						bw.newLine();
					}
					break;
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
