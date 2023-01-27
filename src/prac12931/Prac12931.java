package prac12931;

import java.util.*;

public class Prac12931 {

    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        long n = 12345;
//
//        int[] answer = solution.solution(n);
//
//        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=n;

        while (a > 0) {
            answer += a%10;
            a = a/10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}