package q1018;

//지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 
//지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
//
//체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고,
//변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
//
//보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
//당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

//첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.

//첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		char[][] bwArr = new char[n][m];

		// 보드 입력
		for (int i = 0; i < n; i++) {
			String row = br.readLine();
			for (int j = 0; j < m; j++) {
				bwArr[i][j] = row.charAt(j);
			}
		}

		int minChange = Integer.MAX_VALUE;

		// 시작점을 이동하면서 체스판을 만들 수 있는 경우를 검사
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int changeCount1 = 0; // 맨 왼쪽 위 칸이 흰색인 경우
				int changeCount2 = 0; // 맨 왼쪽 위 칸이 검은색인 경우
				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						if ((k + l) % 2 == 0) { // 정답과 다른 색인 경우
							if (bwArr[k][l] == 'B') {
								changeCount1++;
							} else {
								changeCount2++;
							}
						} else {
							if (bwArr[k][l] == 'W') {
								changeCount1++;
							} else {
								changeCount2++;
							}
						}
					}
				}
				// 맨 왼쪽 위 칸이 흰색일 때와 검은색일 때의 변경 횟수 중 작은 값을 선택
				int minChangeCount = Math.min(changeCount1, changeCount2);
				// 최소 변경 횟수 업데이트
				minChange = Math.min(minChange, minChangeCount);
			}
		}

		bw.write(String.valueOf(minChange));
		bw.flush();
		bw.close();
		br.close();
	}
}
