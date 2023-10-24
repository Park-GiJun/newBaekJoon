package q1735;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int[] b = new int[2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int lcmed = lcm(a[1], b[1]);
        int son = (a[0] * (lcmed / a[1])) + (b[0] * (lcmed / b[1]));
        int sonGcd = gcd(lcmed, son);
        int reducedSon = son / sonGcd;
        int reducedLcmed = lcmed / sonGcd;

        bw.write(String.valueOf(reducedSon) + " " + String.valueOf(reducedLcmed));
        bw.flush();
        br.close();
        bw.close();
    }
}
