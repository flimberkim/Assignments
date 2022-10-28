package me.day04.practice;

import java.util.Arrays;
import java.util.Scanner;
public class Practice07 {
    public static void main(String[] args) {

        int money;
        int[] menu = new int[] {2500, 3000, 4000, 5000};
        Scanner sc = new Scanner(System.in);

        System.out.print("현금을 얼마 가지고 있니? ");
        money = sc.nextInt();
        System.out.println(money + "원");

        if(money < Arrays.stream(menu).min().getAsInt()) {
            System.out.println("돈이 부족하여 김밥천국 입장 불가능합니다.");
            return;
        }

        System.out.println("메뉴를 선택해주세요.");
        System.out.println("=================");
        System.out.println("1. 김밥 (2500) ");
        System.out.println("2. 라면 (3000) ");
        System.out.println("3. 떡볶이 (4000) ");
        System.out.println("4. 돈까스 (5000) ");
        System.out.println("5. 종료 ");
        System.out.println("=================");

        while(true){
            int num = sc.nextInt();
            System.out.println("메뉴 주문 번호 : " + num);
            switch(num){
                case(1): {
                    money -= 2500;
                    if(money == 0){
                        System.out.println("잔돈은 " + money + "원입니다.");
                        System.out.println("더이상 선택할 수 없습니다. 프로그램 종료.");
                        System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                        return;
                    }
                    else if(money < Arrays.stream(menu).min().getAsInt()){
                        System.out.println("김밥 선택하셨습니다.");
                        System.out.println("잔돈은 " + money + "원입니다.");
                        System.out.println("더이상 선택할 수 없습니다. 프로그램 종료.");
                        System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                        return;
                    }
                    System.out.println("김밥 선택하셨습니다.");
                    System.out.println("잔돈은 " + money + "원입니다.");
                    break;
                }
                case(2):{
                    money -= 3000;
                    if(money == 0){
                        System.out.println("잔돈은 " + money + "원입니다.");
                        System.out.println("더이상 선택할 수 없습니다. 프로그램 종료.");
                        System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                        return;
                    }
                    else if(money < Arrays.stream(menu).min().getAsInt()){
                        System.out.println("라면 선택하셨습니다.");
                        System.out.println("잔돈은 " + money + "원입니다.");
                        System.out.println("더이상 선택할 수 없습니다. 프로그램 종료.");
                        System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                        return;
                    }
                    else if(money < 3000){
                        System.out.println("돈이 부족하여 메뉴를 선택할 수 없습니다.");
                        break;
                    }
                    System.out.println("라면 선택하셨습니다.");
                    System.out.println("잔돈은 " + money + "원입니다.");
                    break;
                }
                case(3):{
                    money -= 4000;
                    if(money == 0){
                        System.out.println("잔돈은 " + money + "원입니다.");
                        System.out.println("더이상 선택할 수 없습니다. 프로그램 종료.");
                        System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                        return;
                    }
                    else if(money < Arrays.stream(menu).min().getAsInt()){
                        System.out.println("떡볶이 선택하셨습니다.");
                        System.out.println("잔돈은 " + money + "원입니다.");
                        System.out.println("더이상 선택할 수 없습니다. 프로그램 종료.");
                        System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                        return;
                    }
                    else if(money < 4000){
                        System.out.println("돈이 부족하여 메뉴를 선택할 수 없습니다.");
                        break;
                    }
                    System.out.println("떡볶이 선택하셨습니다.");
                    System.out.println("잔돈은 " + money + "원입니다.");
                    break;

                }
                case(4):{
                    money -= 5000;
                    if(money == 0){
                        System.out.println("잔돈은 " + money + "원입니다.");
                        System.out.println("더이상 선택할 수 없습니다. 프로그램 종료.");
                        System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                        return;
                    }
                    else if(money < Arrays.stream(menu).min().getAsInt()){
                        System.out.println("돈까스 선택하셨습니다.");
                        System.out.println("잔돈은 " + money + "원입니다.");
                        System.out.println("더이상 선택할 수 없습니다. 프로그램 종료.");
                        System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                        return;
                    }
                    else if(money < 5000){
                        System.out.println("돈이 부족하여 메뉴를 선택할 수 없습니다.");
                        break;
                    }
                    System.out.println("돈까스 선택하셨습니다.");
                    System.out.println("잔돈은 " + money + "원입니다.");
                    break;

                }
                case(5): {
                    System.out.println("프로그램 종료");
                    System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                    return;
                }
                default: {
                    System.out.println("메뉴 선택 오류. 1~5번 사이의 메뉴를 선택해주세요.");
                }
            }
        }
    }
}
