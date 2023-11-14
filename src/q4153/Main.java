package q4153;

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

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            } else {
                if (arr[2] * arr[2] == (arr[1] * arr[1] + arr[0] * arr[0])) {
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }
        }

    }
}
