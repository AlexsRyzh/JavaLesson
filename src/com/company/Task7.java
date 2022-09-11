package com.company;

import java.util.Scanner;

public class Task7 {

    public static void divides1(int dividMin, int n){
        if (n%dividMin==0){
            System.out.print(dividMin+" ");
            divides1(dividMin,n/dividMin);

        }else{
            if (dividMin<n){
                divides1(dividMin+1,n);
            }
        }
    }

    public static void divides(int n){
        divides1(2, n);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        divides(n);
    }
}
