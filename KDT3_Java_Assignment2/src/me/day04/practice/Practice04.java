package me.day04.practice;

public class Practice04 {
    public static void main(String[] args) {
        //우리가 가지고 있는 수를 순서대로 배열에 할당
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //중복이 없이 순서쌍을 출력하는 과정을 구현
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

}
