package com.company.task2;


import java.util.Random;

public class Test {

    private static int partition(Student arr[], int begin, int end, SortingStudentsByGPA sort) {
        Student pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (sort.compare(arr[j],pivot)<0) {
                i++;

                Student swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Student swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public static void quickSort(Student arr[], int begin, int end, SortingStudentsByGPA sort) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end, sort);

            quickSort(arr, begin, partitionIndex-1, sort);
            quickSort(arr, partitionIndex+1, end, sort);
        }
    }

    public static Student[] randArr(int n){
        Random rand = new Random();
        Student[] arr = new Student[n];
        for (int i=0; i<n; i++){
            arr[i] = new Student(rand.nextInt(100));;
        }
        return arr;
    }

    public static void print(Student[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i].getFinalScore()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 50;
        Student[] arr = randArr(n);
        print(arr);
        quickSort(arr, 0,n-1, new SortingStudentsByGPA());
        print(arr);
    }
}
