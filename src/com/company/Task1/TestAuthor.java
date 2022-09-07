package com.company.Task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Peter", "pet12@mail.com", 'M');

        ///Author Test
        System.out.println("Author------------------------");
        System.out.println(author);


        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        author.setEmail("oleg@mail.ru");

        System.out.println(author);
        System.out.println("Author------------------------");
    }
}
