package com.yulits;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean checkEquality(String word) {

        if (word.length() <= 1)
            return true;
        else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return checkEquality(word.substring(1, word.length() - 1));
        }
        else
            return false;
    }

    public static void polindrome() {

        System.out.print("Enter a string to check if it is a polindrome: ");

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (checkEquality(word))
            System.out.println("It is a polindrome!");
        else
            System.out.println("IT is not a polindrome!");
    }


    public static void main(String[] args) {
        TowerOfHanoi tower = new TowerOfHanoi();
        tower.solveHanoi(4);
    }

}

