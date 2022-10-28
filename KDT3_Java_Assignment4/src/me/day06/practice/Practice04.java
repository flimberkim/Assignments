package me.day06.practice;

import java.util.Scanner;
public class Practice04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        String[] arr = new String[num];
        int sum;
        int count;

        //문자열을 입력받고, 문자열의 길이가 조건에 해당하지 않으면 종료
        for(int i = 0; i < num; i++){
            arr[i] = input.next();
            if((arr[i].length() < 0) || (arr[i].length() > 80)) return;
        }

        //알파벳 O를 확인할 때마다 count 1씩 증가시키고 매번 sum에 더함. X를 만나는 순간 count값은 0으로 초기화
        for(int j = 0; j < arr.length; j++){
            sum = 0;
            count = 0;
            for(int k = 0; k < arr[j].length(); k++){
                if(arr[j].charAt(k) == 'O'){
                    count++;
                    sum += count;
                }
                else count = 0;
            }
            System.out.println(sum);
        }
    }
}
