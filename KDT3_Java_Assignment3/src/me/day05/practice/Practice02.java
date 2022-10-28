package me.day05.practice;

import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {

        int caseNum;
        String word;
        Scanner sc = new Scanner(System.in);

        caseNum = sc.nextInt();
        //몇번 시행할 것인지 입력받고 그만큼 반복문 수행
        for(int i = 0; i < caseNum; i++){
            int repeat = sc.nextInt();
            word = sc.next();
            //몇번 반복할 것인지 입력받은만큼 문자를 반복해서 출력
            for(int j = 0; j < word.length(); j++){
                for(int k = 0; k < repeat; k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
