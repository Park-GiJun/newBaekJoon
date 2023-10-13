package q10845;

//정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//명령은 총 여섯 가지이다.
//
//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			String inp = br.readLine();
			if (inp.contains("push")) {
				String[] parts = inp.split(" ");
				int x = Integer.parseInt(parts[1]);
				list.add(x);
			} else {
				switch (inp) {
				case "pop":
					if (list.isEmpty()) {
						bw.write("-1\n");
					} else {
						bw.write(String.valueOf(list.remove(0)) + "\n");
					}
					break;
				case "size":
					bw.write(String.valueOf(list.size()) + "\n");
					break;
				case "empty":
					if (list.isEmpty()) {
						bw.write("1\n");
					} else {
						bw.write("0\n");
					}
					break;
				case "front":
					if (list.isEmpty()) {
						bw.write("-1\n");
					} else {
						bw.write(String.valueOf(list.get(0)) + "\n");
					}
					break;
				case "back":
					if (list.isEmpty()) {
						bw.write("-1\n");
					} else {
						bw.write(String.valueOf(list.get(list.size() - 1)) + "\n");
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
