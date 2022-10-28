package me.day06.practice;

public class Practice02 {
    public static void main(String[] args) {

        int[] nums = new int[100];
        int temp;

        //1부터 100사이의 정수를 배열에 입력
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) ((Math.random()*100) + 1);
        }

        //배열을 오름차순으로 재정렬
        for(int j = 1; j < nums.length; j++){
            for(int k = 0; k < nums.length - j; k++) {
                if (nums[k] > nums[k + 1]) {
                    temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;
                }
            }
        }

        System.out.println("최솟값: " + nums[0]);
        System.out.println("최댓값: " + nums[99]);
    }
}
