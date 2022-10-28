package me.day06.practice;

import java.util.Scanner;
public class Practice06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];
        String[] answer = new String[n];
        String ans;
        String temp;
        int num;

        num = (int) Math.pow(2, n) - 1;
        //첫번째 지도 생성
        System.out.println("첫번째 지도를 생성합니다.");
        System.out.println("범위가 0보다 크고 " + num + "보다 작은 정수를 " + n + "회 입력하세요.");
        for(int i = 0; i < n; i++){
            arr1[i] = input.nextInt();
        }
        //두번째 지도 생성
        System.out.println("두번째 지도를 생성합니다.");
        System.out.println("범위가 0보다 크고 " + num + "보다 작은 정수를 " + n + "회 입력하세요.");
        for(int i = 0; i < n; i++){
            arr2[i] = input.nextInt();
        }

        //두 지도의 각 숫자를 비트연산하여 새로운 int 배열 result에 저장
        for(int i = 0; i < n; i++){
            result[i] = arr1[i] | arr2[i];
        }

        //result에 저장된 정수를 이진문자열로 만들어서 저장.
        //만약 길이가 짧다면 문자열 앞에 부족한만큼 "0"을 붙여서 다시 만든다!
        for(int j = 0; j < n; j++){
            answer[j] = Integer.toBinaryString(result[j]);
            if(answer[j].length() < n){
                temp = answer[j];
                for(int i = 0; i < n - answer[j].length(); i++){
                    temp = "0" + temp;
                }
                answer[j] = temp;
            }
            //각 문자열에서 0이 있으면 공백으로, 1이 있으면 #으로 바꿔서 저장
            ans = answer[j].replace("0"," ");
            answer[j] = ans;
            ans = answer[j].replace("1","#");
            answer[j] = ans;
        }
        //answer 문자열 배열을 출력
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i] + " ");
        }
     }
}
