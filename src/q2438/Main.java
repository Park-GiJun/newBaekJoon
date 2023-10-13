package q2438;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int star = Integer.parseInt(br.readLine());
//		
//		for (int i = 0 ; i <= star; i++) {
//			for (int j =0; j <= i; j++) {
//				bw.write("*");
//			}
//			bw.newLine();
//		}
//	}
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 0; i <a; i++) {
			for (int j = 0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}
}
