package q10988;

//알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
//
//팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
//
//level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
        boolean isPalindrome = true;

        int left = 0;
        int right = str.length() - 1;

		 while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                isPalindrome = false;
	                break;
	            }
	            left++;
	            right--;
	        }
		 
		 if (isPalindrome) {
	            bw.write("1");
	        } else {
	            bw.write("0");
	        }

		bw.flush();
		bw.close();
		br.close();
	}

}
