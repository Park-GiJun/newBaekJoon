package com.codingtest.example;

import java.util.Scanner;

public class q14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if (a > 0) {
			if (b > 0) {
				System.out.println("1");
			} else if (b < 0) {
				System.out.println("4");
			}
		} else if (a < 0) {
			if (b > 0) {
				System.out.println("2");
			} else if ( b < 0) {
				System.out.println("3");
			}
		}
	}

}
