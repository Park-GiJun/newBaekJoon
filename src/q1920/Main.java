package q1920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        //선언부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //N개의 숫자와 A 맵
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> A = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A.put(Integer.parseInt(st.nextToken()), i);
        }

        //M개의 숫자와 B 맵
        int m = Integer.parseInt(br.readLine());
        int[] B = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            if (A.containsKey(B[i])) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
            bw.write(String.valueOf(B[i]) + "\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
