package prac12933;

import java.util.*;


public class Prac12933 {
    public static void main(String[] args) {
        Solution s = new Solution();
        long n = 8941814651L;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        long m = n;
        int digit = 0;
        while (m>0) {
            m = m/10;
            digit++;
        }

        long[] arr = new long[digit];
        for(int i=0;i<digit;i++) {
            arr[i] = n%10;
            n = n/10;
//            System.out.println(Arrays.toString(arr));
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for(int j = digit-1;j >= 0;j--) {
            answer = (answer*10) + arr[j];
        }

        return answer;
    }
}