package com.company.task3;

import com.github.javafaker.Faker;

import java.util.Random;

public class Student {
    private int age ;
    private String name;
    private String secondName;

    public Student(){
        Faker faker = new Faker();
        Random rand = new Random();
        age = rand.nextInt(100);
        name = faker.name().name();
        secondName = faker.name().lastName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
