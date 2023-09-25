public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        // 조명 켜기! (1단계)
        light.power();

        // 조명 밝기 높이기 (1단계 → 2단계)
        light.up();

        // 조명 밝기 높이기 (2단계 → 3단계)
        light.up();

        // 조명 밝기 높이기 (3단계 → 1단계)
        light.up();

        // 조명 밝기 높이기 (1단계 → 2단계)
        light.up();

        // 조명 밝기 높이기 (2단계 → 3단계)
        light.up();

        // 조명 밝기 높이기 (3단계 → 1단계)
        light.up();

        // 조명 끄기!
        light.power();

        // 조명이 켜져있을 땐 밝기 높이기 불가능!
        light.up();
    }
}