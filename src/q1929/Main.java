package q1929;

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


        Map<Integer, Integer> findMap = new HashMap<>();
        Map<Integer, Integer> inputMap = new HashMap<>();


        for (int i = 2; i <= m; i++) {
            findMap.put(i, i);
        }

        for (int i = n; i <= m; i++) {
            inputMap.put(i, i);
        }
    }
}
