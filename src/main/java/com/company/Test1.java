package com.company;

import java.util.ArrayList;

public class Test1 {



    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();

        for (int i=0; i<10; i++){
            list1.add(i);
        }
        list1.add(8);
        System.out.println("list1: "+list1);
        list1.add(2,-12);
        System.out.println("list1: "+list1);
        ArrayList list2 = new ArrayList();
        list2.addAll(list1);

        System.out.println("list2: "+list2);

        list1.clear();
        System.out.println("list1: "+list1);

        ArrayList clone = (ArrayList<Integer>) list1.clone();

        System.out.println("Clone list1: "+clone);

        System.out.println("Get(5) list2: "+list2.get(5));

        System.out.println(list2.indexOf(2));
        System.out.println(list2.lastIndexOf(8));


    }
}
