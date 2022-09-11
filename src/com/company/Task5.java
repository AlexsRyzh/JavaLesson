package com.company;

import java.util.Scanner;

public class Task5 {

    public static int sum(int n){
        if (n<10){
            return n;
        }
        return n%10 + sum(n/10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        System.out.println(sum(in.nextInt()));
    }
}
