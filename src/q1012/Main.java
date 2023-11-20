package q1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int m;
    static int n;
    static int k;
    static int warm;
    static int[][] cabbage;
    static boolean[][] visited;

    static void dfs(int a, int b) {
        if (a < 0 || b < 0 || a >= m || b >= n || visited[a][b] || cabbage[a][b] == 0) {
            return;
        }

        visited[a][b] = true;

        dfs(a + 1, b);
        dfs(a - 1, b);
        dfs(a, b + 1);
        dfs(a, b - 1);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            cabbage = new int[m][n];
            visited = new boolean[m][n];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                cabbage[a][b] = 1;
            }

            warm = 0;

            for (int q = 0; q < m; q++) {
                for (int r = 0; r < n; r++) {
                    if (!visited[q][r] && cabbage[q][r] == 1) {
                        dfs(q, r);
                        warm++;
                    }
                }
            }
            System.out.println(warm);
        }
    }
}
