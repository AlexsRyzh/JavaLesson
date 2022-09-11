package com.company;

import java.util.Scanner;

public class Task8 {

    public static String Palindrom1(int start,String n){
        if (start<n.length()/2 && n.charAt(start)==n.charAt(n.length()-start-1)){
            return Palindrom1(start+1,n);

        }
        if (start>=n.length()/2) return "YES";
        return ("NO");
    }

    public static String Palindrom(int n){
        return Palindrom1(0,Integer.toString(n));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        System.out.println(Palindrom(n));

    }
}
