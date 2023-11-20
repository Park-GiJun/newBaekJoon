package q2108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static int findSecondSmallestMostFrequentValue(TreeMap<Integer, Integer> sortedMap) {
        int mostFrequentValue = sortedMap.firstKey();
        int maxFrequency = 0;
        int secondSmallestKey = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int currentFrequency = entry.getValue();

            if (currentFrequency > maxFrequency) {
                mostFrequentValue = entry.getKey();
                maxFrequency = currentFrequency;
                secondSmallestKey = entry.getKey();  // 빈도수가 갱신되면 값으로 초기화
            } else if (currentFrequency == maxFrequency && entry.getKey() < secondSmallestKey) {
                secondSmallestKey = entry.getKey();
            }
        }

        return secondSmallestKey;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] ints = new int[n];

        int arg = 0;

        for (int i = 0; i < n; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ints);
        for (int i = 0; i < n; i++) {
            arg += ints[i];
        }

        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = integerIntegerMap.getOrDefault(ints[i], 0);
            integerIntegerMap.put(ints[i], val + 1);
        }

        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(integerIntegerMap);
        int mostFrequentValue = findSecondSmallestMostFrequentValue(sortedMap);

        arg = arg / n;
        bw.write(String.valueOf(arg) + "\n");
        bw.write(String.valueOf(ints[n / 2]) + "\n");
        bw.write(String.valueOf(mostFrequentValue) + "\n");
        bw.write(String.valueOf(ints[n - 1] - ints[0]));
        bw.flush();
        bw.close();
        br.close();
    }
}
