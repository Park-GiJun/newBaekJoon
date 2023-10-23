package q1269;

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

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            mapA.put(Integer.parseInt(st.nextToken()), i + 1);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            mapB.put(Integer.parseInt(st.nextToken()), i + 1);
        }
        int uni = 0;
        int min = 0;
        for (Map.Entry<Integer, Integer> entry : mapA.entrySet()) {
            int compare = entry.getKey();
            if (!mapB.containsKey(compare)) {
                uni++;
            }
        }

        for (Map.Entry<Integer, Integer> entry : mapB.entrySet()) {
            int compare = entry.getKey();
            if (!mapA.containsKey(compare)) {
                min++;
            }
        }
        bw.write(String.valueOf(uni + min));
        bw.flush();
        bw.close();
        br.close();

    }
}
