package com.codedifferently.labs.lab12.part_a.activity;

import java.util.Scanner;

public class Activity04_IfElseDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = 0;
        System.out.println("Enter a number:");
        value = in.nextInt();
        if (value == 7) {
            System.out.println("That's lucky!");
        } else {

            System.out.println("That's unlucky!");
        }

    }
}
