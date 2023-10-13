package q11718;

//입력 받은 대로 출력하는 프로그램을 작성하시오.

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a;
		
		while((a = br.readLine())!=null) {
			System.out.println(a);
		}
		bw.flush();
		bw.close();
		br.close();

	}

}
