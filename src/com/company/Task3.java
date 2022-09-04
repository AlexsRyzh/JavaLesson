package com.company;

public class Task3 {
    public static void main(String[] args) {
        double sumRow = 0; ///Начальное значение гармонического ряда
        for (int i=1; i<=10; i++){
            sumRow+= 1./i;
        }
        System.out.println("Сумма первых 10 чисел гармонического ряда = "+sumRow);
    }
}
