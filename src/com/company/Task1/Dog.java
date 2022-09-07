package com.company.Task1;

public class Dog {
    private String name;
    private String owner;
    private int age = 3;
    private String breed = "Afador";

    public Dog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public Dog(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public Dog(String name, String owner, int age, String breed) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{\n" +
                "  name = " + name + '\n' +
                "  owner = " + owner + '\n' +
                "  age = " + age +'\n'+
                "  breed = " + breed + '\n' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String intoHumanAge(){
        return name+"'s age in human years is "+age*7+" years";
    }

    public  void getVoice(){
        System.out.println("Woof Woof");
    }

}
