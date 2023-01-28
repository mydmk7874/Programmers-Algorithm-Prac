package prac12935;

import java.util.*;

public class Prac12935 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr = {4,3,2,1,6,335,432};
        System.out.println(Arrays.toString(s.solution(arr)));

    }
}


class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int min = arr[0];

        for(int i=0;i < arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length-1];

        for(int i=0;i < arr.length; i++) {
            if(arr[i] == min) {
                for(int j=i+1; j < arr.length; j++) {
                    answer[j-1] = arr[j];
                }
                break;
            }
            answer[i] = arr[i];
        }
        return answer;

    }
}