package com.company;

public class Main {

    public static void main(String[] args) {



       //Задание 1
       int n = 0;

       while (n < 10) {
           n = n + 1;
           System.out.print(n + " ");
       }

       for (;n > 0;) {
            if (n == 10) {
                System.out.println();
            }
            System.out.print(n + " ");
            n = n - 1;
       }
        System.out.println();

       //Задание 2

       int i = 4;

       while (i < 31) {
           System.out.println("Сегодня пятница " + i + "-е число. Нужно подготовить отчет");
           i = i + 7;
       }

       //Задание 3
       int yearCurrent = 2021;
       int yearStartPrint = 2021 - 200;
       int yearStart = 0;

       while (yearStart < yearCurrent + 100) {
           if (yearStart > yearStartPrint) {
               System.out.println(yearStart);
           }
           yearStart = yearStart + 79;
       }
    }
}
