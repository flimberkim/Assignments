package me.day05.practice;

import java.util.Scanner;
public class Practice05 {
    public static void main(String[] args) {

        boolean answer = true;
        boolean wrongAnswer = false;
        Scanner input = new Scanner(System.in);
        String s;
        int countp = 0; //p의 개수를 셀 변수
        int county = 0; //y의 개수를 셀 변수
        s = input.next();

        s = s.toLowerCase(); //대소문자를 구분하지 않으므로 먼저 소문자로 변환

        for(int i = 0; i < s.length(); i++){
            if((s.length() > 50) || !((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))) return;
            if(s.charAt(i) == 'p') countp++; //p가 있을때마다 countp 1씩 증가
            if(s.charAt(i) == 'y') county++; //y가 있을때마다 county 1씩 증가
        }

        if(countp == county) System.out.println(answer);
        else System.out.println(wrongAnswer);
    }
}
