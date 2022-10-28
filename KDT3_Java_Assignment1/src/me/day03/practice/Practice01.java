package me.day03.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double korea;
        double math;
        double english;
        double avg;

        System.out.print("국어 성적을 입력하세요: ");
        korea = sc.nextDouble();
        if(korea < 0 || korea > 100){
            System.out.println("국어 성적이 유효하지 않습니다.");
            return;
        }

        System.out.print("수학 성적을 입력하세요: ");
        math = sc.nextDouble();
        if(math < 0 || math > 100){
            System.out.println("수학 성적이 유효하지 않습니다.");
            return;
        }

        System.out.print("영어 성적을 입력하세요: ");
        english = sc.nextDouble();
        if(english < 0 || english> 100){
            System.out.println("영어 성적이 유효하지 않습니다.");
            return;
        }
        avg = (korea + math + english)/3;

        if(avg >= 70){
            System.out.println("합격");
        }

    }
}
