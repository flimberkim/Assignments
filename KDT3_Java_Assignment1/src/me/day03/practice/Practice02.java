package me.day03.practice;

import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //

        int alpha;

        System.out.print("알파벳을 입력하세요: ");
        alpha = sc.next().charAt(0);

        if(!(alpha >= 'A' && alpha <= 'Z') && !(alpha >= 'a' && alpha <= 'z')){
            System.out.println("영문자가 유효하지 않습니다.");
            return;
        }
        else if(alpha >= 'a' && alpha <= 'z'){
            alpha = alpha - 32;
            System.out.printf("%c\n", alpha);
        }
        else{
            System.out.printf("%c\n", alpha);
        }

    }
}
