package com.klunniy.anonimClass;

public class Main {
    public static void main(String[] args) {
        Print clazz = new Print() {
            @Override
            public void print() {
                System.out.println("hello !!!!!!!!!");
            }
        };

        clazz.print();
    }
}
