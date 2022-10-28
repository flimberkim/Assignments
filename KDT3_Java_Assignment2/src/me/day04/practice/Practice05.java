package me.day04.practice;

public class Practice05 {
    public static void main(String[] args) {

        int count = 0;

        for(int i = 1; i <= 100; i++){
            for(int j = 1; j <= 100; j++){
                for(int k = 1; k <= 100; k++){
                    if((i + j > k) && (k*k == j*j + i*i)) count++;
                }
            }
        }
        System.out.println("쌍의 개수는 " + count/3 + "개 입니다."); //중복된 순서쌍을 제거하기 위해 3으로 나눔

    }
}
