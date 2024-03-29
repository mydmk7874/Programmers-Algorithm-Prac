package prac12954_x만큼간격이있는n개의숫자;

import java.util.Arrays;

//x만큼 간격이 있는 n개의 숫자
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
//다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
public class Prac12954 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int x = 3;
        int n = 9;
        System.out.println(Arrays.toString(s.solution(x, n)));
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer= new long[n];
        for(int i=0; i<n; i++) {
            answer[i] = x+(long)i*x;
        }
            return answer;
    }
}