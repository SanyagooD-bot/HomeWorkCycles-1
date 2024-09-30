import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашная работа № 1 Циклы");

        System.out.println("______________Задание 1_________________");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 2_________________");
        for (int i = 10; i >= 1; i = i - 1)
        {
            System.out.println(i);
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 3_________________");
        for (int i = 0; i < 17; i=i+2)
        {
            System.out.println(i);
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 4_________________");
        for(int i = 10; -10 <= i; i = i - 1)
        {
            System.out.println(i);
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 5_________________");
        for(int i = 1904; i <= 2096; i=i+4){
            System.out.println(i +"год является високосным");
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 6_________________");
        for(int i = 7; i <= 98; i=i+7){
            System.out.println(i);
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 7_________________");
        for(int i = 1; i <= 512; i=i*2){
            System.out.println(i);
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 8_________________");
        int solary = 29000;
        int total = 0;
        for(int i = 1; i <= 12; i++){
            total = total + solary;

            System.out.println("Месяц " + i + " сумма накоплений равна " + total +" рублей");
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 9_________________");
        int solary1 = 29000;
        int total1 = 0;
        for(int i = 0; i < 12; i++){
            total1 = total1 + total1/100;
            total1 = total1 + solary1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 +" рублей");
        }
        System.out.println("________________________________________");

        System.out.println("______________Задание 10_________________");
        for (int i = 2; i == 2; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
        System.out.println("________________________________________");


    }
}