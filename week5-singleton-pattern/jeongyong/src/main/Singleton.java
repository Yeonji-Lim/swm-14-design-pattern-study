package main;

public class Singleton {
    private Singleton() { }

    // private static volatile Singleton singleton = null;
    private static Singleton singleton = null;
    public static synchronized Singleton getInstance() { // synchronized를 빼면 처음에 객체 2개 생
        if (singleton == null) {
            System.out.println("싱글톤 생성");
            singleton = new Singleton();
        }
        return singleton;

        // DCLP (Double Checked Locking Pattern)
//        if (singleton == null) { 1. singleton 객체의 존재 여부 판단
//            synchronized (Singleton.class) { // 2. 동기화되어 하나의 객체만 생성
//                if (singleton == null) {
//                    System.out.println("싱글톤 생성");
//                    singleton = new Singleton();
//                }
//            }
//        }
    }
}
