package q19532;

//수현이는 4차 산업혁명 시대에 살고 있는 중학생이다. 코로나 19로 인해, 수현이는 버추얼 학교로 버추얼 출석해 버추얼 강의를 듣고 있다. 
//수현이의 버추얼 선생님은 문자가 2개인 연립방정식을 해결하는 방법에 대해 강의하고, 다음과 같은 문제를 숙제로 냈다.
//
//다음 연립방정식에서 
//$x$와 
//$y$의 값을 계산하시오.
// 
//\[\begin{cases}ax+by=c\\dx+ey=f\end{cases}\] 
//4차 산업혁명 시대에 숙제나 하고 앉아있는 것보다 버추얼 친구들을 만나러 가는 게 더 가치있는 일이라고 생각했던 수현이는 이런 연립방정식을 풀 시간이 없었다. 
//다행히도, 버추얼 강의의 숙제 제출은 인터넷 창의 빈 칸에 수들을 입력하는 식이다. 각 칸에는 
//$-999$ 이상 
//$999$ 이하의 정수만 입력할 수 있다. 수현이가 버추얼 친구들을 만나러 버추얼 세계로 떠날 수 있게 도와주자.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

//		{ax+by=c}
//		{cx+dy=f)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		// 입력값 배열로 만들기
		int[] inp = new int[6];
		for (int i = 0; i < 6; i++) {
			inp[i] = Integer.parseInt(st.nextToken());
		}

		// x,y값 찾기
		int x = 0;
		int y = 0;
		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if (inp[0] * i + inp[1] * j == inp[2] && inp[3] * i + inp[4] * j == inp[5]) {
					x = i;
					y = j;
				}

			}

		}
		bw.write(String.valueOf(x) + " " + String.valueOf(y));
		bw.flush();
		bw.close();
		br.close();
	}

}
