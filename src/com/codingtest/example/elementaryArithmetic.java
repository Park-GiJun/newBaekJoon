package com.codingtest.example;

import java.util.Scanner;

public class elementaryArithmetic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((int)a/b);
        System.out.println(a%b);
        sc.close();
    }
    
}