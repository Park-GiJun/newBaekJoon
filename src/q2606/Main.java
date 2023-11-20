package q2606;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int computer;
    static int connectNetwork;
    static int[] computers;
    static String[] connectNetworks;
    static boolean[] virus;

    static void checkVirus(int currentComputer) {
        virus[currentComputer] = true;
        for (int i = 0; i < connectNetwork; i++) {
            StringTokenizer st = new StringTokenizer(connectNetworks[i]);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == currentComputer && !virus[b]) {
                checkVirus(b);
            } else if (b == currentComputer && !virus[a]) {
                checkVirus(a);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        computer = Integer.parseInt(br.readLine());
        connectNetwork = Integer.parseInt(br.readLine());

        computers = new int[computer + 1];
        connectNetworks = new String[connectNetwork];
        virus = new boolean[computer + 1];

        for (int i = 1; i <= computer; i++) {
            computers[i] = i;
        }
        for (int i = 0; i < connectNetwork; i++) {
            connectNetworks[i] = br.readLine();
        }

        checkVirus(1);

        int infectedCount = 0;
        for (int i = 1; i <= computer; i++) {
            if (virus[i]) {
                infectedCount++;
            }
        }

        System.out.println(infectedCount-1);
    }
}

