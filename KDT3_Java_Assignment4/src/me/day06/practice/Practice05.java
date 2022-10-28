package me.day06.practice;

import java.util.Scanner;
public class Practice05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next().toUpperCase();
        int[] alpha = new int[26]; //대문자만 생각
        int max = -1;
        char ch =' ';

        //대문자 알파벳의 유니코드 값에서 65를 빼면 각각 0~25이므로, 해당 되는 배열의 수를 1씩 증가
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')){
                alpha[s.charAt(i) - 65]++;
            }
        }

        //alpha배열에서 가장 큰 값을 가지고 있는 값을 찾고, 그 숫자에 65를 더해 알파벳으로 출력.
        //alpha배열에서 같은 값이 두개 이상이라면 빈도수가 같은 알파벳이 있다는 뜻이므로 '?'출력
        for(int j = 0; j < alpha.length; j++){
            if(alpha[j] > max){
                max = alpha[j];
                ch = (char) (j + 65);
            }
            else if (alpha[j] == max){
                ch = '?';
            }

        }
        System.out.println(ch);
    }
}
