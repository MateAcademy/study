package com.klunniy.lambda;

interface Executable {
    int execute(int x);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10);
        System.out.println(a);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(x -> x + 10);
    }
}
