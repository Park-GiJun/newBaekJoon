package q11866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            dq.offer(i);
        }

        System.out.print("<");
        while (!dq.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                int front = dq.poll();
                dq.offer(front);
            }

            int removed = dq.poll();
            System.out.print(removed);

            if (!dq.isEmpty()) {
                System.out.print(", ");
            }
        }

        System.out.print(">");
    }
}