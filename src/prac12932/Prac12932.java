package prac12932;

import java.util.*;

public class Prac12932 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        long n = 123405;

        int[] answer = solution.solution(n);

        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(long n) {
        int digit = 0;
        long m = n ;

        while (m > 0) {
            m = m/10;
            digit++;
        }

        int[] answer =new int[digit];

        for (int i=0;i<digit;i++){
            answer[i]=(int)(n%10);
            n = n/10;
        }

        return answer;
    }
}