package q10816;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> mapN = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            mapN.put(card, mapN.getOrDefault(card, 0) + 1);
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int count = mapN.getOrDefault(target, 0);
            result.add(count);
        }
        
        for (int count : result) {
            bw.write(count + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

