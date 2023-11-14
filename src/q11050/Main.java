package q11050;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int factorial(int a) {
        int k = 1;
        for (int i = 1; i <= a; i++) {
            k = k * i;
        }
        return k;
    }

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n == m || m == 0) {
            System.out.println(1);
        } else {
            System.out.println(factorial(n) / (factorial(m) * factorial(n - m)));
        }
    }
}