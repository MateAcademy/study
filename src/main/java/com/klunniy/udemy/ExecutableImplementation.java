package com.klunniy.udemy;

public class ExecutableImplementation implements Executable {

    @Override
    public void execute(int x) {
        System.out.println(x + 5);
        System.out.println("ExecutableImplementation");
    }
}
