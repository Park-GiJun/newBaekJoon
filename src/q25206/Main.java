package q25206;

//인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
//
//치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
//
//전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
//
//인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat df = new DecimalFormat("#.######");

		double sum = 0;
		int cnt = 0;
		String[] gradeNames = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };
		double[] gradePoints = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0 };

		for (int i = 0; i < 20; i++) {
			String[] line = br.readLine().split(" ");
			String grade = line[2];
			double gradePoint = Double.parseDouble(line[1]);
			if (!line[2].equals("P")) {
				cnt += Double.parseDouble(line[1]);
				sum += Double.parseDouble(line[1]) * getPoint(grade, gradeNames, gradePoints);
			}
		}
		if (sum > 0) {
			bw.write(df.format(sum / cnt));
		}else {
			bw.write("0.000000");
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static double getPoint(String grade, String[] gradeNames, double[] gradePoints) {
		for (int i = 0; i < gradeNames.length; i++) {
			if (grade.equals(gradeNames[i])) {
				return gradePoints[i];
			}
		}
		return 0.0;
	}
}