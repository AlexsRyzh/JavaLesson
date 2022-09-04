package com.company.task3;

public class Book {
    private String author;
    private String title;
    private int yearOfWritting;
    private int yearOfRelease;
    private int rating;

    public Book(String author, String title, int yearOfWritting, int yearOfRelease, int rating) {
        this.author = author;
        this.title = title;
        this.yearOfWritting = yearOfWritting;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfWritting() {
        return yearOfWritting;
    }

    public void setYearOfWritting(int yearOfWritting) {
        this.yearOfWritting = yearOfWritting;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfWritting=" + yearOfWritting +
                ", yearOfRelease=" + yearOfRelease +
                ", rating=" + rating +
                '}';
    }
}
