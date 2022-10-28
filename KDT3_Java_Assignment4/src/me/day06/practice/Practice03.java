package me.day06.practice;

import java.util.Scanner;
public class Practice03 {
    public static void main(String[] args) {

        int[][] scores2d = new int[5][4];
        int sum = 0;
        double avg = 0;
        double temp1;
        double temp2;
        double[][] avgStu = new double[5][2]; //학생번호와 학생별 과목 평균점수만 넣어둔 배열
        double[][] avgSub = {{1.0,2.0,3.0},{0.0, 0.0, 0.0}}; //과목명과 과목별 학생 평균점수만 넣어둔 배열

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < scores2d.length; i++){
            System.out.println("학생 번호를 입력하세요: ");
            scores2d[i][0] = input.nextInt();
            avgStu[i][0] = scores2d[i][0];
            for(int j = 1; j < scores2d[i].length; j++){
                if(j == 1){
                    System.out.println("국어 성적 입력: ");
                    scores2d[i][j] = input.nextInt();
                }
                else if(j == 2){
                    System.out.println("수학 성적 입력: ");
                    scores2d[i][j] = input.nextInt();
                }
                else{
                    System.out.println("영어 성적 입력: ");
                    scores2d[i][j] = input.nextInt();
                }
            }
        }

        //학생번호와 학생별 과목 성적 평균만 있는 배열을 완성
        for(int i = 0; i < scores2d.length; i++){
            for(int j = 1; j < scores2d[i].length; j++){
                sum += scores2d[i][j];
            }
            avgStu[i][1] = (double)(sum)/3;
            sum = 0;
        }


        //과목 이름과 과목별 학생성적 평균만 있는 배열을 완성
        //국어==1.0, 수학==2.0, 영어==3.0으로 설정
        for(int j = 1; j < 4; j++){
            for(int i = 0; i < scores2d.length; i++){
                sum += scores2d[i][j];
            }
            avgSub[1][j-1] = (double)(sum)/5;
            sum = 0;
        }

        //과목별 학생 평균 내림차순 정렬
        for(int j = 1; j < avgSub[0].length; j++){
            for(int k = 0; k < avgSub[1].length - j; k++) {
                if (avgSub[1][k] < avgSub[1][k + 1]) {
                    temp1 = avgSub[1][k];
                    avgSub[1][k] = avgSub[1][k + 1];
                    avgSub[1][k + 1] = temp1;

                    temp2 = avgSub[0][k];
                    avgSub[0][k] = avgSub[0][k + 1];
                    avgSub[0][k + 1] = temp2;
                }
            }
        }

        //학생별 과목 평균 오름차순 정렬
        for(int j = 1; j < avgStu.length; j++){
            for(int k = 0; k < avgStu.length - j; k++) {
                if (avgStu[k][1] > avgStu[k + 1][1]) {
                    temp1 = avgStu[k][1];
                    avgStu[k][1] = avgStu[k + 1][1];
                    avgStu[k + 1][1] = temp1;

                    temp2 = avgStu[k][0];
                    avgStu[k][0] = avgStu[k + 1][0];
                    avgStu[k + 1][0] = temp2;
                }
            }
        }

        //내림차순으로 정렬한 것 출력
        for(int i = 0; i < avgSub[0].length; i++){
            if(avgSub[0][i] == 1.0){
                System.out.print("국어성적 평균 : " + avgSub[1][i]);
                System.out.println();
            }
            else if(avgSub[0][i] == 2.0){
                System.out.print("수학성적 평균 : " + avgSub[1][i]);
                System.out.println();
            }
            else {
                System.out.print("영어성적 평균 : " + avgSub[1][i]);
                System.out.println();
            }

        }

        //오름차순으로 정렬한 것 출력
        for(int i = 0; i < avgStu.length; i++){
            if(avgStu[i][0] == 1.0){
                System.out.print("학생번호1의 성적 평균 : " + avgStu[i][1]);
                System.out.println();
            }
            else if(avgStu[i][0] == 2.0){
                System.out.print("학생번호2의 성적 평균 : " + avgStu[i][1]);
                System.out.println();
            }
            else if(avgStu[i][0] == 3.0){
                System.out.print("학생번호3의 성적 평균 : " + avgStu[i][1]);
                System.out.println();
            }
            else if(avgStu[i][0] == 4.0){
                System.out.print("학생번호4의 성적 평균 : " + avgStu[i][1]);
                System.out.println();
            }
            else{
                System.out.print("학생번호5의 성적 평균 : " + avgStu[i][1]);
                System.out.println();
            }
        }
    }
}

