package com.klunniy.downloading;


class A {
    static int a = 1;
    int b;

    public A(int b) {
        this.b = b;
        this.test();
    }

    public void test() {
        System.out.println("AAA");
    }
}


public class Main extends A {

    static int c;
    int d;

    public Main() {
        super(999);
        this.test();
    }

    public static void main(String[] args) {
        A main = new Main();
    }

    @Override
    public void test() {
        System.out.println("BBB");
    }
}
