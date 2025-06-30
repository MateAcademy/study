package com.klunniy.udemy;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
//        runner.run(new ExecutableImplementation());

        int a = 5;
        runner.run(new Executable() {
            @Override
            public void execute(int x) {
                int a = 5;
                System.out.println(x + a);
                System.out.println("Main");
            }
        });

        a = 6;

        runner.run((x) -> {
            int b = 5;
            System.out.println(x + b);
            System.out.println("Main");
        });
    }
}
