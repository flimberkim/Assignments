package me.day04.practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < NUM; i++) {
            double score = sc.nextDouble();
            if(score < 0 || score > 100) {
                System.out.println("유효하지 않은 성적 입력값입니다.");
                i -= 1;
                continue;
            }
            sum += score;
        }
        avg = sum / NUM;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}

