package q9063;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<Integer> listX = new ArrayList<Integer>();
		List<Integer> listY = new ArrayList<Integer>();

		// 횟수 입력
		int n = Integer.parseInt(br.readLine());

		// X와 Y값 리스트 만들기
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			listX.add(Integer.parseInt(st.nextToken()));
			listY.add(Integer.parseInt(st.nextToken()));
		}
		int maxX = listX.get(listX.size() - 1);
		int maxY = listY.get(listY.size() - 1);
		int minX = listX.get(0);
		int minY = listY.get(0);

		// max, min값 찾기
		for (int i = 0; i < n; i++) {
			maxX = Math.max(maxX, listX.get(i));
			maxY = Math.max(maxY, listY.get(i));
			minX = Math.min(minX, listX.get(i));
			minY = Math.min(minY, listY.get(i));
		}

		int wid = maxX - minX;
		int hei = maxY - minY;

		// 넓이 출력
		bw.write(String.valueOf(wid * hei));
		bw.flush();
		bw.close();
		br.close();

	}

}
