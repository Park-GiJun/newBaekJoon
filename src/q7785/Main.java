package q7785;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		Map<String, String> attend = new HashMap<String, String>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String key = st.nextToken();
			String value = st.nextToken();
			if (attend.containsKey(key) && value.equals("leave")) {
				attend.remove(key);
			} else {
				attend.put(key, value);
			}
		}

		List<String> sortedKeys = new ArrayList<>(attend.keySet());
		Collections.sort(sortedKeys, Collections.reverseOrder());

		for (String key : sortedKeys) {
			bw.write(key + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
