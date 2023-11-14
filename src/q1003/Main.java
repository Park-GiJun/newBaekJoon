package q1003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] one = new int[41];
        int[] zero = new int[41];
        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            for (int j = 2; j <= m; j++) {
                zero[j] = zero[j - 2] + zero[j - 1];
                one[j] = one[j - 2] + one[j - 1];
            }
            bw.write(String.valueOf(zero[m]) + " " + String.valueOf(one[m]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}


