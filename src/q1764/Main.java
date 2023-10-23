package q1764;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        Map<String, Integer> listen = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String inp = br.readLine();
            listen.put(inp, i+1);
        }
        Map<String, Integer> view = new HashMap<>();
        for (int i = 0 ; i < m ; i++){
            String inp = br.readLine();
            view.put(inp, i+1);

        }

        List<String> list = new ArrayList<>();


    }
}
