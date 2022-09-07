package com.company.Task1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Gek", "Peter");
        Dog dog2 = new Dog("Sharik", "Nikola", 6);
        Dog dog3= new Dog("Puding", "Vova", 10, "golden retriever");

        ///Dog1
        System.out.println();
        System.out.println(dog1);
        dog1.setAge(12);
        System.out.println(dog1.getBreed());
        System.out.println(dog1.intoHumanAge());
        System.out.println(dog1);
        System.out.println();

        ///Dog2
        System.out.println();
        System.out.println(dog2);
        dog2.setBreed("beagle");
        dog2.setName("Koka");
        System.out.println(dog2.getOwner());
        System.out.println(dog2);
        System.out.println();


        ///Dog3
        System.out.println();
        System.out.println(dog3);
        dog3.setOwner("Lena");
        System.out.println(dog3.getName());
        System.out.println(dog3);
        System.out.println();
    }
}
