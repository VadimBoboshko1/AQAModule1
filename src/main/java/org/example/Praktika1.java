package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Praktika1 {
   public static void main(String[] args) {

       int year;
       String model;

       int[] integers = new int[7];
       integers[0] = 1;
       integers[1] = 2;
       integers[2] = 3;
       integers[3] = 4;
       integers[4] = 5;
       integers[5] = 6;
       integers[6] = 7;

       for (int i = 0; i < integers.length; i++) {
           System.out.println(integers[i]);
           if (integers[i] == 5) {
               break;
           }
}
           ArrayList<String> names = new ArrayList<>();
           names.add("Яблоко");
           names.add("Груша");
           names.add("Банан");
           names.add("Апельсин");
           names.add("Киви");
           names.add("Ананас");
           names.add("Манго");
           names.add("Арбуз");
           names.add("Вишня");
           names.add("Персик");
           for (String name : names) {
               System.out.println(name);
           }

       }


   }


