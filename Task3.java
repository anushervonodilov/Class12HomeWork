package com.StringExercises;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String babyName;

        System.out.println("Enter the dad's name");
        String dadName = input.next();

        System.out.println("Enter the mom's name");
        String momName = input.next();

        System.out.println("Are you expecting a boy or a girl?");
        String babyGender = input.next();

        if (babyGender.equalsIgnoreCase("boy")) {
            babyName = dadName.substring(0, 3) + momName.substring(2);
        } else {
            babyName = momName.substring(0, 2) + dadName.substring(3);
        }
        System.out.println("The suggested name is " + babyName);

    }
}
