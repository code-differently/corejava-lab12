package com.codedifferently.labs.lab12.part_a.examples;

public class Example02_EqualityString {

    public static void main(String args[]) {
        String name1 = "Fred Smith";
        String name2 = "Sam Smith";
        if (name1.equals(name2)) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }
    }
}