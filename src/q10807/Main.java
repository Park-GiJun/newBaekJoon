package q10807;

//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); 
		String line = br.readLine(); 
		String[] arr = line.split(" ");
		int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		int v = Integer.parseInt(br.readLine()); 
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (nums[i] == v) {
				count++;
			}
		}

		bw.write(Integer.toString(count)); 
		bw.newLine();

		bw.flush();
		bw.close();
		
		br.close();
		
		
	}

}
