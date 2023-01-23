package com.StringExercises;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }





    }
}
