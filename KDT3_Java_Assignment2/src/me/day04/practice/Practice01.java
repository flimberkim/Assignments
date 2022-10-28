package me.day04.practice;

import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {

        char[] word = new char[30]; // 30칸짜리 char 형 배열 생성
        Scanner input = new Scanner(System.in);
        System.out.println("문자를 입력하세요! q를 입력하면 종료합니다.");
        while(true){ //입력 받은 문자를 배열 word에 하나씩 입력, q를 입력하면 반복문 나감
            for(int i = 0; i < word.length; i++){
                word[i] = input.next().charAt(0);
                if(word[i] == 'q') break;
            }
            break;
            }

            for(int j = 0; j < word.length; j++){ //word배열을 하나하나 출력하고, 문자 q를 만나면 출력하지 않고 종료
                if(word[j] == 'q') break;
                System.out.print(word[j]);
            }
        }

    }
