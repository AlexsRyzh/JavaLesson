package com.company.Task3;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Sherlock");
        Book book2 = new Book("Sherlock","2009");

        ///Book1 - Test
        System.out.println("Book1--------------------");
        System.out.println(book1);
        book1.setTitle("The Red-Headed League");
        book1.setRate(10);
        System.out.println(book1.getTitle());
        System.out.println(book1.getYearsOfWriting());
        System.out.println(book1);
        System.out.println("Book1--------------------");


        ///Book2 - Test
        System.out.println("Book2--------------------");
        System.out.println(book2);
        book2.setYearsOfPublication("2010");
        book2.setYearsOfWriting("2005");
        System.out.println(book2.getRate());
        System.out.println(book2.getYearsOfPublication());
        System.out.println(book2);
        System.out.println("Book2--------------------");
    }
}
