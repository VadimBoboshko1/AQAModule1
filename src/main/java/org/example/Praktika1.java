package org.example;

import java.util.ArrayList;

public class Praktika1 {
    private int year;
    private String model;

    public static void main(String[] args) {
        Praktika1 example = new Praktika1();
        example.run();
    }

    public void run() {
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


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

