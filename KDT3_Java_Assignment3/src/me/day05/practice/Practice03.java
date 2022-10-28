package me.day05.practice;

import java.util.Scanner;
//저는 case를 나누어서 코딩을 했고, 모든 경우 단어의 수를 맞게 출력하는데 백준에서는 틀린 답이라고 나옵니다...
public class Practice03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        int count = 0;


        sentence = input.nextLine(); //문장을 입력받고 공백의 개수를 통해 단어의 개수를 파악
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.length() > 1000000) return;
            if(sentence.charAt(i) == ' ') count++; //공백의 개수를 카운트
        }
        if(sentence.charAt(0) == ' '){
            System.out.println(count); //첫 칸이 공백이라면 단어 = 공백의 개수 이므로 그대로 출력
        }
        else {
            System.out.println(count + 1); //첫 칸이 공백이 아니라면 첫 단어의 개수 1개가 추가되어야 하므로
        }
    }
}
