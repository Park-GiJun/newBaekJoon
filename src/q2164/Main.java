package q2164;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        Deque<Integer> qu = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            qu.offer(i);
        }
        while (qu.size() > 1) {
            qu.poll();
            int m = qu.poll();
            qu.offer(m);
        }
        System.out.print(qu.getFirst());
    }
}

