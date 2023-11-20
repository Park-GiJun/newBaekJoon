package q2667;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int n;
    static int[][] house;
    static boolean[][] visited;
    static int count;
    static ArrayList<Integer> counts = new ArrayList<>();

    static void dfs(int a, int b) {
        if (a < 0 || b < 0 || a >= n || b >= n || visited[a][b] || house[a][b] == 0) {
            return;
        }

        visited[a][b] = true;
        count++;


        dfs(a + 1, b);
        dfs(a - 1, b);
        dfs(a, b + 1);
        dfs(a, b - 1);
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        house = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String inp = br.readLine();
            for (int j = 0; j < n; j++) {
                house[i][j] = Integer.parseInt(String.valueOf(inp.charAt(j)));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (house[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    counts.add(count);
                }
            }
        }
        bw.write(String.valueOf(counts.size()) + "\n");

        Collections.sort(counts);
        for (int i : counts) {
            bw.write(String.valueOf(i) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
