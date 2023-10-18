package q18870;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int[] numsCo = Arrays.copyOf(nums, n);

		List<Integer> distinctSortedNums = Arrays.stream(numsCo).distinct().sorted().boxed()
				.collect(Collectors.toList());

		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < distinctSortedNums.size(); i++) {
			numMap.put(distinctSortedNums.get(i), i);
		}

		for (int i = 0; i < n; i++) {
			int index = numMap.get(nums[i]);
			bw.write(String.valueOf(index) + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
