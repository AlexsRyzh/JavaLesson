package com.company;

import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("F:\\JavaLesson\\src\\main\\java\\com\\company\\file.txt")){
            int char1;
            while ((char1 = reader.read()) != -1){
                System.out.print((char) char1);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
