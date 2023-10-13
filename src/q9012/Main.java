package q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	// 2nd case
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String inp = sc.next();
			boolean bStr = true;
			stk.clear();
			for (int j = 0; j < inp.length(); j++) {
				if (inp.charAt(j) == '(') {
					stk.push('(');
				} else {
					if (stk.isEmpty()) {
						bStr = false;
						break;
					} else {
						stk.pop();
					}
				}
			}
			if (stk.isEmpty() && bStr == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}