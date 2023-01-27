package prac12910;

import java.util.Arrays;

public class Prac12910 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(s.solution(arr,divisor));
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int answerlength = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%divisor == 0) {
                answerlength++;
            }
        }

        if (answerlength == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[answerlength];


        for (int i = 0,j = 0; i < arr.length; i++){
            if (arr[i]%divisor == 0) {
                answer[j] = arr[i];
                j++;
            }
        }

        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

        return answer;
    }
}