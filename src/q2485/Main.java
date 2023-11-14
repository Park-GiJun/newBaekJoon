package q2485;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> opt = new ArrayList<>();
    static void count(int a, int b) {
        int c = b-a;
        opt.add(c);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> trees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trees.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < trees.size(); i++) {

        }
    }
}
