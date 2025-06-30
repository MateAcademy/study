package com.klunniy.polimorfizm;

public class B implements A {
    public int bInt;

    @Override
    public void aTest() {
        System.out.println("B.aTest");
    }


    public void bTest() {
        System.out.println("B.bTest");
    }
}
