package com.company;


import static java.lang.System.out;

public class Task1 {
    public static void main(String[] args){
        int[] mass1 = {9,11,19,23,47,67,75,81,94,96};
        int[] mass2 = {1,4,6,13,36,38,41,55,56,65};
        int[] mass3 = {6, 10, 17, 19, 28, 47, 52, 73, 94, 98};

        int sum1 = 0;///Сумма элементов первого массива
        for (int i=0; i< mass1.length; i++){
            sum1+=mass1[i];
        }
        int sum2 = 0;///Сумма элементов второго массива
        int i=0;
        while (i< mass2.length){
            sum2+=mass2[i];
            i++;
        }
        int sum3 = 0;///Сумма элементов третьего массива
        i=0;
        do {
            sum3+=mass3[i];
            i++;
        } while(i< mass2.length);
        ///Вывод сумм sum1,sum2,sum3
        out.println("Сумма в первом массиве = "+sum1);
        out.println("Сумма во втором массиве массиве = "+sum2);
        out.println("Сумма в третьем массиве = "+sum3);

    }
}
