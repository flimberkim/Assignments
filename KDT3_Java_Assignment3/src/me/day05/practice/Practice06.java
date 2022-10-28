package me.day05.practice;

import java.util.Scanner;
public class Practice06 {
    public static void main(String[] args) {

        String phone_number;
        String answer = "";

        Scanner input = new Scanner(System.in);
        phone_number = input.next();

        if(!((phone_number.length() >= 4) && (phone_number.length() <= 20))) return;
        for(int i = 0;  i < phone_number.length() - 4; i++){ //입력받은 전화번호 개수 중, 끝 4개만 남겨놓고 *로 바꿔 answer에 저장
            answer += "*";
        }
        for(int j = phone_number.length() - 4; j < phone_number.length(); j++){ //마지막 4자리는 입력받은 전화번호를 answer에 저장
            answer += phone_number.charAt(j);
        }
        System.out.println(answer);

    }
}
