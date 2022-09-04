package com.company.task3;

public class BookTest {
    public static void test1(){
        System.out.println("Начало 1 теста");
        Book book = new Book(
                "Peter Grin",
                "Day",
                2003,
                2007,
                10
        );
        System.out.println(book);
        book.setAuthor("Fines");
        book.setRating(3);
        System.out.println(book);
        System.out.println("Title: "+book.getTitle());
        System.out.println("Rating: "+book.getRating());
        System.out.println("Конец 1 теста");
        System.out.println();
    }
    public static void test2(){
        System.out.println("Начало 2 теста");
        Book book = new Book(
                "Nikola Kag",
                "Night",
                2000,
                2009,
                3
        );
        System.out.println(book);
        book.setTitle("MidNight");
        book.setYearOfRelease(1998);
        book.setYearOfWritting(1996);
        System.out.println(book);
        System.out.println("Author: "+book.getAuthor());
        System.out.println("getYearOfRelease: "+book.getYearOfRelease());
        System.out.println("getYearOfWritting: "+book.getYearOfWritting());
        System.out.println("Конец 2 теста");
        System.out.println();
    }
    public static void main(String[] args) {
        test1();
        test2();
    }
}
