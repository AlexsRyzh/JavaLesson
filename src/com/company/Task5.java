package com.company;

public class Task5 {
    ///Функция вычисления факториала числа
    // Аргументы(число для которого надо посчитать факториал)
    public static long factorial(long number){
        ///Проверка числа
        if (number < 0){
            System.out.println("Число должно быть положительное!!");
            return -1;
        }
        /// Начальное значение факториала
        long fact = 1;
        for (long i=2; i<=number; i++){
            fact*=i;
        }
        return fact;
    }

    ///Метод тест для проверки факториала 5
    public static void testFact5(long number){
        System.out.print("Test1 факториал числа 5: ");
        if (number == 120){
            System.out.println("Всё верно он равен " + number);
            return;
        }
        System.out.println("Должно быть 120, а не "+number);
    }

    ///Метод тест для проверки факториала 10
    public static void testFact10(long number){
        System.out.print("Test1 факториал числа 10: ");
        if (number == 3628800){
            System.out.println("Всё верно он равен " + number);
            return;
        }
        System.out.println("Должно быть 3628800, а не "+number);
    }

    ///Метод тест для проверки факториала 12
    public static void testFact12(long number){
        System.out.print("Test1 факториал числа 12: ");
        if (number == 479001600){
            System.out.println("Всё верно он равен " + number);
            return;
        }
        System.out.println("Должно быть 479001600, а не "+number);
    }

    public static void main(String[] args) {
        testFact5(factorial(5));
        testFact10(factorial(10));
        testFact12(factorial(12));
    }
}
