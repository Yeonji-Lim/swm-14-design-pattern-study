package main;

public class Main {
    public static void main(String[] args) {
        MultiThread case1 = new MultiThread("Case 1");
        MultiThread case2 = new MultiThread("Case 2");

        case1.start();
        case2.start();
    }
}
