package prac42842_카펫;

//카펫
//https://school.programmers.co.kr/learn/courses/30/lessons/42842

import java.util.Arrays;

public class Prac42842 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(s.solution(brown, yellow)));
    }
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int a= brown+yellow;

        for(int i = 3; i <= a/3; i++) {
            int j = a/i;

            if((i-2)*(j-2) == yellow) {
                answer[0] = Math.max(i, j);
                answer[1] = Math.min(i, j);
            }

        }


        return answer;
    }
}