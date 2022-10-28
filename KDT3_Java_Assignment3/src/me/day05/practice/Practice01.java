package me.day05.practice;

import java.util.Scanner;
public class Practice01 {

    public static void main(String[] args) {
        //입력받은 문장을 모두 대문자로 바꾼 뒤, 원하는 위치만 소문자로 바꾸는 방식으로 구현
        String input; //입력받을 문자열
        String upper = ""; //입력받은 문자를 모두 대문자로 저장할 변수 선언
        String output = ""; //최종 출력할 문자열
        int tmp;

        Scanner sc = new Scanner(System.in);

        System.out.print("메시지 입력: ");
        input = sc.nextLine();
        //입력받은 문장을 모두 대문자로 바꾸어 upper에 저장
        for(int i = 0; i < input.length(); i++){

            tmp = (int) input.charAt(i);

            if((tmp >= 65) && (tmp <= 90)){//대문자면 그대로 저장
                    upper +=(char) (tmp);
            }
            else upper +=(char) (tmp - 32);//소문자면 대문자로 변환해서 저장

            //만약 공백이라면 그대로 저장
            if(tmp == 32){
                upper +=(char) (tmp);
            }
        }
        //upper를 가지고 원하는 부분만 소문자로 변환
        for(int j = 0; j < upper.length(); j++){
            tmp = (int) upper.charAt(j);

            if(j == 0){
                output +=(char) (tmp + 32); //첫번째 알파벳은 무조건 소문자로 변환
            }
            else if(tmp == 32){ //만약 공백이라면
                output += (char) (tmp); //공백을 문자열에 먼저 포함하고
                tmp = (int) upper.charAt(j + 1); //공백 다음 알바펫을 소문자로 변환
                output +=(char) (tmp + 32);
                j++; //다음 실행은 공백 다다음 알파벳이 되어야 하기 때문에 j에 1을 더해줌
            }
            else output +=(char) (tmp);
        }
        System.out.println(output);
    }
}
/***************다른건 다 되는데 공백이 포함되어있을 때 자꾸 이상한 기호가 하나 추가됩니다..
                코드를 계속 다시 봐도 모르겠어요 왜 뜨는지ㅠㅠ ************************/