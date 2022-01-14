package com.codedifferently.labs.lab12.part_a.examples;

public class Example01_IndexOf {
    public static void main(String args[]) {
        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf('-');
        System.out.println("index of first dash: "+ idx1);
        int idx2 = phoneNum.indexOf('-', idx1 + 1);
        System.out.println("second dash idx: "+ idx2);
    }
}