package me.day06.practice;

import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        int temp;
        int max;
        int min;
        int sum = 0;
        double avg; //평균
        double var; //분산
        double sd;  //표준편차

        //10명의 성적을 입력받음
        for(int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
        }

        //입력받은 성적을 순서대로 배열에서 재정렬
        for(int j = 1; j < scores.length; j++){
            for(int k = 0; k < scores.length - j; k++) {
                if (scores[k] > scores[k + 1]) {
                    temp = scores[k];
                    scores[k] = scores[k + 1];
                    scores[k + 1] = temp;
                }
            }
        }
        max = scores[9]; //배열의 끝에 최댓값
        min = scores[0]; //배열의 처음에 최솟값

        //성적의 총합을 계산
        for(int k = 0; k < scores.length; k++){
            sum += scores[k];
        }

        avg = sum/10;
        temp = 0;
        for(int i = 0; i < scores.length; i++){
            temp += Math.pow((scores[i]-avg), 2);
        }
        var = temp/10;
        sd = Math.sqrt(var);

        System.out.print("최댓값: " + max + "\n");
        System.out.print("최솟값: " + min + "\n");
        System.out.print("평균: " + avg + "\n");
        System.out.print("분산: " + var + "\n");
        System.out.print("표준편차: " + sd + "\n");
    }
}
