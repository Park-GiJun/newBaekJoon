package q10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int n = Integer.parseInt(br.readLine());
	        int[] arry = new int[n];

	        String a = br.readLine();
	        StringTokenizer st = new StringTokenizer(a);
	        for (int i = 0; i < n; i++) {
	            if (st.hasMoreTokens()) {
	                arry[i] = Integer.parseInt(st.nextToken());
	            } else {
	                bw.flush();
	                bw.close();
	                br.close();
	                return;
	            }
	        }
	        Arrays.sort(arry);
	        bw.write(arry[0] + " " + arry[n - 1]);

	        bw.flush();
	        bw.close();
	        br.close();
	    }
	}
