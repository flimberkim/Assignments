package me.day03.practice;

import java.util.Scanner;
public class Practice04 {
    public static void main(String[] args) {

        double x;
        double y;

        Scanner sc = new Scanner(System.in);

        System.out.println("각각 x,y좌표에 해당하는 두 실수를 입력하세요!");
        System.out.print("x: ");
        x = sc.nextDouble();
        System.out.print("y: ");
        y = sc.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("1 사분면");
        }
        else if(x < 0 && y > 0){
            System.out.println("2 사분면");
        }
        else if(x < 0 && y < 0){
            System.out.println("3 사분면");
        }
        else if(x > 0 && y < 0){
            System.out.println("4 사분면");
        }
        else if(x != 0 && y == 0){
            System.out.println("x 축 위에 있음");
        }
        else if(x == 0 && y != 0){
            System.out.println("y 축 위에 있음");
        }
        else{
            System.out.println("원점");
        }
    }
}
