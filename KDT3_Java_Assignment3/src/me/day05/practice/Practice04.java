package me.day05.practice;

import java.util.Scanner;
public class Practice04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        num1 = input.nextInt();
        num2 = input.nextInt();
        //정수로 입력받은 두 수를 거꾸로 읽는 문자열을 저장한 후, 그 문자열을 다시 정수형으로 변환
        num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
        num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());

        System.out.println(num1 > num2 ? num1 : num2);
    }
}
