package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task4 {
    ///Функция генерации массива случайным образом
    // Аргументы(кол-во элементов, макс. диап.)
    public static int[] randArr(int numberOfElem, int maxRange){
        Random rand = new Random();///Создание объекта генератора
        int[] newArr = new int[numberOfElem];
        for (int i=0; i<numberOfElem; i++){
            newArr[i] = rand.nextInt(maxRange);///Записываем в массив слчайные числа
        }
        return newArr;
    }
    public static void printArr(int[] array){
        System.out.print("Элементы массива: ");
        for (int elem: array){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = randArr(10, 100);
        printArr(array);
        Arrays.sort(array);
        printArr(array);
    }
}
