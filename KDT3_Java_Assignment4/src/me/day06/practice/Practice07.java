package me.day06.practice;

import java.util.Arrays;

public class Practice07 {
    public static void main(String[] args) {

        String[][] jsonTable = {{"|","name","|","age","|","secretIdentity","|","powers","|"},
                {"|","Molecule Man","|","29","|","Dan Jukes","|","Radiation resistance","|"},
                {"|","Madame Uppercut","|","39","|","Jane Wilson","|","Damage resistance","|"},
                {"|","Eternal Flame","|","1000000","|","Unknown","|","Heat Immunity","|"}};

        //처음 구분선 출력
        System.out.println("-----------------------------------------------------------------------------------------------");
        //홀수번째 열은 오른쪽 정렬하여 출력
        for(int i = 0; i < jsonTable.length;  i++){
            for(int j = 0; j < jsonTable[i].length; j++){
                if((j == 1) || (j == 3) || (j == 5) || (j == 7)){
                    System.out.printf("%20s", jsonTable[i][j]);
                    continue;
                }
                System.out.print(" " + jsonTable[i][j] + " ");
            }
            System.out.println();
            //첫 행 출력 후 구분선 출력
            if(i == 0){
                System.out.println("-----------------------------------------------------------------------------------------------");
            }
        }

        //마지막 구분선 출력
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}