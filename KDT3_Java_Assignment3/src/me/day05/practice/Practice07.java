package me.day05.practice;

import java.util.Scanner;
public class Practice07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s;
        String output = "";
        String temp = "";
        s = input.nextLine();

        //입력받은 문자열에 대해서, 알파벳과 숫자인 경우에만 output에 저장
        for(int i = 0; i < s.length(); i++){
            if(((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) || ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) || ((s.charAt(i) >= 48) && (s.charAt(i) <= 57))){
                output += s.charAt(i);
            }
        }

        output = output.toLowerCase();  //저장한 output을 모두 소문자로 변환
        temp = new StringBuffer(output).reverse().toString(); //output을 뒤집은 문자를 temp에 저장
        if(output.equals(temp)){ //output과 temp를 비교하여 결과 출력
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
