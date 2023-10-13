package q3009;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[3][2];
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		if (arr[0][0] == arr[1][0]) {
			System.out.print(arr[2][0] + " ");
		} else if (arr[0][0] == arr[2][0]) {
			System.out.print(arr[1][0] + " ");
		} else if (arr[1][0] == arr[2][0]) {
			System.out.print(arr[0][0] + " ");
		}

		if (arr[0][1] == arr[1][1]) {
			System.out.print(arr[2][1] + " ");
		} else if (arr[0][1] == arr[2][1]) {
			System.out.print(arr[1][1] + " ");
		} else if (arr[1][1] == arr[2][1]) {
			System.out.print(arr[0][1] + " ");
		}

	}

}
