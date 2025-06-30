package com.klunniy.lambda.lesson1;

public interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 20);
        System.out.println(a);
    }
}

class Main {
    public static void main(String[] args) {

        Runner r = new Runner() {
            @Override
            public void run(Executable e) {
                System.out.println(5);
                System.out.println(10);
            }
        };

        Runner runner = new Runner();
        int a = 5;

        runner.run(new Executable() {
            public int execute(int x, int y) {
                int a = 7;
                System.out.println(a);
                return x + y;
            }
        });

//        runner.run((x, y) -> {
//            System.out.println(x);
//            System.out.println(x + 5);
//            System.out.println(x);
//            return x;
//        });
    }
}