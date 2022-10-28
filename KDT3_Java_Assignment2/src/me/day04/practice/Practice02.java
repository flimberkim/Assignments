package me.day04.practice;

import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {

        char[] word = new char[30]; // 30칸짜리 char 형 배열 생성
        StringBuilder back = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("문자를 입력하세요! q를 입력하면 종료하고, 거꾸로 출력합니다.");
        while (true) { //입력 받은 문자를 배열 word에 하나씩 입력, q를 입력하면 반복문 나감
            for (int i = 0; i < word.length; i++) {
                word[i] = input.next().charAt(0);
                if (word[i] == 'q') break;
            }
            break;
        }

        for (int j = 0; j < word.length; j++) { //q가 들어있는 배열 위치를 찾고, 거기서부터 거꾸로 출력
            if (word[j] == 'q') {
                 for (int k = j - 1; k >= 0; k--) {
                    back.append(word[k]);
                }
            }
        }
        System.out.print(back);
    }
}
