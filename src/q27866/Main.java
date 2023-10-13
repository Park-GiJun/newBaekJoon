package q27866;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		int b = sc.nextInt();

		sc.close();

		String[] arr = a.split("");

		System.out.println(arr[b-1]);

	}

}
