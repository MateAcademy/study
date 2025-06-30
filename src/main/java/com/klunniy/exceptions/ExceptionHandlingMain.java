package com.klunniy.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        PrintWriter printWriter = null;
        do {
            try {
//                System.out.println("Please enter numerator (17)");
//                int numerator = scanner.nextInt();
//
//                System.out.println("Please enter denominator (20)");
//                int denominator = scanner.nextInt();
//
//                int rez = divide(numerator, denominator);

                if (continueLoop) {
                    System.out.println("throw runtime exception - (26)");
                    throw new RuntimeException("runtime exception");
                }

                printWriter = new PrintWriter(new FileWriter("out.txt"));
                printWriter.println("Result = " + 5);

                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine(); // clear invalid input
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open file");
                e.printStackTrace();
            } catch (RuntimeException ex) {
                //System.out.println("catch  RuntimeException - (42)");
            } finally {
                //System.out.println("Finally block closed printWriter - (44)");
                printWriter.close();
            }

            System.out.println("Try catch block finished");
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }

    private static void saveToFile(int res) throws IOException {

    }
}
