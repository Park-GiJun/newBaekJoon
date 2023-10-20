package q1620;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, String> pokeDex = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String pokeName = br.readLine();
			pokeDex.put(pokeName, String.valueOf(i + 1));
		}
		StringBuilder sb = new StringBuilder();
		Map<String, String> reversePokeDex = new HashMap<>();
		for (Map.Entry<String, String> entry : pokeDex.entrySet()) {
		    reversePokeDex.put(entry.getValue(), entry.getKey());
		}
		for (int i = 0; i < m; i++) {
		    String inp = br.readLine();
		    if (!isNumeric(inp)) {
		        sb.append(pokeDex.get(inp)).append("\n");
		    } else if (isNumeric(inp)) {
		        sb.append(reversePokeDex.get(inp)).append("\n");
		    }
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
