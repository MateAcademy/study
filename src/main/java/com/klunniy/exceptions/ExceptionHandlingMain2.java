package com.klunniy.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionHandlingMain2 {
    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        try {
            saveToFile(x, y);
        } catch (IOException e) {
            System.out.println("Error saving to file out.txt");
            throw new RuntimeException(e);
        }
    }

    public static void saveToFile(int x, int y) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("out.txt",  true));
        pw.println("My variables: " + x + " " + y);
        pw.close();
    }
}
