package q1427;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine();

		String[] arr = a.split("");
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		
		Collections.reverse(list);
		for (int num : list) {	
			bw.write(String.valueOf(num));
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
