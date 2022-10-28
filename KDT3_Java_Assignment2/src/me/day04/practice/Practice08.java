package me.day04.practice;

public class Practice08 {
    public static void main(String[] args) {
        // example1, example2을 번갈아가며 실행해보세요.
        // 두 예제 모두 무한루프가 발생하게 되는데 발생하지 않도록 코드를 수정해보세요.
        // example1()
        // example2()
        example1();
        example2();
    }
    public static void example1() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++; // i를 1씩 증가시켜 10회 반복하면 끝나도록 수정
        }
    }
    public static void example2() {
        int k = 1;
        while (k <= 5) {
            int l = 1;
            while (l <= 5) {
                System.out.print("*");
                l++; //코드의 위치를 변경
            }
            System.out.println();
            k++;
            //l++;
        }
    }

}
