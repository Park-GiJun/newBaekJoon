package com.codingtest.example;

import java.util.Scanner;

public class separateNum {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a * ( b % 10));
        System.out.println(a * ((b / 10) % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
        sc.close();
    }
    
}
