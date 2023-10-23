package q1764;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> listen = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String inp = br.readLine();
            listen.put(inp, i + 1);
        }

        Map<String, Integer> view = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String inp = br.readLine();
            view.put(inp, i + 1);
        }

        List<String> listA = new ArrayList<>();

        for (Map.Entry<String, Integer> listenEntry : listen.entrySet()) {
            String listB = listenEntry.getKey();
            if (view.containsKey(listB)) {
                listA.add(listB);
            }
        }
        List<String> sortedListA = listA.stream()
                .sorted()
                .collect(Collectors.toList());
        bw.write(String.valueOf(sortedListA.size()) + "\n");
        for (String item : sortedListA) {
            bw.write(item + "\n");
        }

        br.close();
        bw.close();
    }
}
