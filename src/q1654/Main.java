package q1654;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] haveLan = new long[k];


        for (int i = 0; i < k; i++) {
            haveLan[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(haveLan);
        long start = 1L;
        long mid = 0;
        long end = haveLan[k - 1];
        while (start <= end) {
            mid = start + (end - start) / 2;
            long count = 0;
            for (int i = 0; i < k; i++) {
                count += Math.floor(haveLan[i] / (double) mid);
            }
            if (count < n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start - 1);
    }
}
