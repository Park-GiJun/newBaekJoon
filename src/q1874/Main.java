package q1874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> integerStack = new Stack<>();
        int count = 0;
        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            integerStack.add(i);
        }

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            if (count == target) {
                integerStack.push(count++);
                sb.append("+\n");
                int num = integerStack.pop();
                integerHashSet.add(num);
                sb.append("-\n");
            } else if (count > target) {
                if (integerHashSet.contains(target)) {
                    sb.append("NO");
                    break;  // 수정된 부분: "NO"를 출력하고 더 이상의 처리를 하지 않도록 break 추가
                }

                int num = integerStack.pop();
                integerHashSet.add(num);
                sb.append("-\n");
                while (num > target) {
                    num = integerStack.pop();
                    integerHashSet.add(num);
                    sb.append("-\n");
                }
            } else if (count < target) {
                int num = count++;
                integerStack.push(num);
                sb.append("+\n");
                while (num <= target) {
                    if (num == target) {
                        integerStack.pop();
                        integerHashSet.add(num);
                        sb.append("-\n");
                        break;
                    }
                    num = count++;
                    integerStack.push(num);
                    sb.append("+\n");
                }
            }
        }
        if (!sb.toString().contains("NO")) {  // 수정된 부분: "NO"가 없는 경우에만 출력
            bw.write(sb.toString());
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
