package com.codedifferently.labs.lab12.part_a.examples;

public class Example03_Replace {
    public static void main(String[] args) {
        String replace = "String replace with replace First";
        String newString = replace.replaceFirst("re", "RE");
        System.out.println(newString);
    }
}
