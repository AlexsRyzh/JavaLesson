package com.company.Task3;

public class Book {
    private String title;
    private String yearsOfWriting = "Not written";
    private String yearsOfPublication = "Not published";
    private int rate = 0;


    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String yearsOfWriting) {
        this.title = title;
        this.yearsOfWriting = yearsOfWriting;
    }

    public Book(String title, String yearsOfWriting, String yearsOfPublication) {
        this.title = title;
        this.yearsOfWriting = yearsOfWriting;
        this.yearsOfPublication = yearsOfPublication;
    }

    public Book(String title, String yearsOfWriting, String yearsOfPublication, int rate) {
        this.title = title;
        this.yearsOfWriting = yearsOfWriting;
        this.yearsOfPublication = yearsOfPublication;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Book{" +'\n'+
                "  title = " + title + '\n' +
                "  yearsOfWriting = " + yearsOfWriting + '\n' +
                "  yearsOfPublication = " + yearsOfPublication + '\n' +
                "  rate = " + rate +'\n'+
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearsOfWriting() {
        return yearsOfWriting;
    }

    public void setYearsOfWriting(String yearsOfWriting) {
        this.yearsOfWriting = yearsOfWriting;
    }

    public String getYearsOfPublication() {
        return yearsOfPublication;
    }

    public void setYearsOfPublication(String yearsOfPublication) {
        this.yearsOfPublication = yearsOfPublication;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void read(){
        System.out.println("Read Read Read!!!");
    }
}
