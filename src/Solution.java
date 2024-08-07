package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/*
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int i = 0;

        while (i < 10) {
            System.out.println(name + " любит меня.");
            i++;
        }
    }
}
