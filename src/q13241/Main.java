package q13241;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static long gcd(long p, long q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long d = lcm(a, b);
        bw.write(String.valueOf(d));
        bw.flush();
    }
}
