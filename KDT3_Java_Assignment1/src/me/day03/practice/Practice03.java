package me.day03.practice;

import java.util.Scanner;
public class Practice03 {
    public static void main(String[] args) {

        int num1;
        int num2;
        double result;
        char opsn;

        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요\n num1: ");
        num1 = sc.nextInt();
        System.out.print("num2: ");
        num2 = sc.nextInt();
        System.out.print("사칙연산(+,-,*,/,%)의 종류를 입력하세요: ");
        opsn = sc.next().charAt(0);

        if(opsn == '+'){
            result = num1 + num2;
        }
        else if(opsn == '-'){
            result = num1 - num2;
        }
        else if(opsn == '*'){
            result = num1 * num2;
        }
        else if(opsn == '/' || opsn == '%'){
            result = (double)num1 / (double)num2;
        }
        else{
            System.out.println("연산자가 유효하지 않습니다.");
            return;
        }

        System.out.printf("결과는 %f 입니다.", result);
    }
}
