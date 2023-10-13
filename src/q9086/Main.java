package q9086;

//문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        String[] arr = new String[a];

        for(int i = 0; i < a; i++){
            String word = sc.next();
            arr[i] = word;
        }

        for(int i = 0; i < a; i++){
            System.out.print(arr[i].charAt(0));
            System.out.print(arr[i].charAt(arr[i].length() - 1)); 
            System.out.println();
        }
    }
}
