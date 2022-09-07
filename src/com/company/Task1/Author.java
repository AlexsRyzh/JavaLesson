package com.company.Task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Author{" +'\n'+
                "  name = " + name + '\n' +
                "  email = " + email + '\n' +
                "  gender = " + gender +'\n'+
                '}';
    }

    public char getGender() {
        return gender;
    }
}
