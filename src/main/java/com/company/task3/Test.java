package com.company.task3;

import java.util.Comparator;

public class Test {

    public static Student[] MergeSort2(Student[] arr, Student[] arr1, Comparator sort){
        Student[] newArr = new Student[arr.length+ arr1.length];
        Student[] tmp = new Student[arr.length+ arr1.length];
        for (int i=0; i< arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i=0; i< arr1.length; i++){
            newArr[arr.length+i] = arr1[i];
        }
        MergeSort(newArr, 0, newArr.length - 1, tmp , sort);
        return newArr;
    }

    public static void MergeSort(Student a[], int start, int end, Student tmp[], Comparator sort) {
        if(start < end) {
            int m = start + (end-start) / 2; // рекурсивно делим массив
            MergeSort(a,start,m,tmp,sort);
            MergeSort(a,m+1,end,tmp,sort);
            Merge(a,start,m,end,tmp,sort);
        }
    }
    // Объединение левой и правой упорядоченных последовательностей вместе в новый упорядоченный массив
    // m представляет индекс сегментации;
    public static void Merge(Student a[],int start,int midle,int end,Student tmp[],Comparator<Student> sort) {
        int pb = 0;
        int p1 = start; // Записываем индекс от s до m
        int p2 = midle + 1; // Записываем координаты от s + 1 до e
        // Сортируем двухсегментный массив после деления и сохраняем его в массиве tmp,
        while(p1 <= midle && p2 <= end) {
            if(sort.compare(a[p1],a[p2])>0)
                tmp[pb++] = a[p1++];
            else
                tmp[pb++] = a[p2++];
        }
        while(p1<=midle)
            tmp[pb++] = a[p1++];
        while(p2<=end)
            tmp[pb++] = a[p2++];
        for (int i = 0; i < end-start+1; i++)
            a[start+i]=tmp[i];
    }



    ///Функция создания массива
    public static Student[] randArr(int n){
        Student[] arr = new Student[n];
        for (int i=0; i<n; i++){
            arr[i] = new Student();
        }
        return arr;
    }


    ///Функция выода массива
    public static void print(Student[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        Student[] arr = randArr(n);
        Student[] arr1 = randArr(n);
        print(arr);
        print(arr1);
        Student[] newArr = MergeSort2(arr,arr1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        print(newArr);
    }
}
