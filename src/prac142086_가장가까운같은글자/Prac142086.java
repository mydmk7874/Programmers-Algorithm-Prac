package prac142086_가장가까운같은글자;

import java.util.Arrays;

//가장 가까운 같은 글자
//https://school.programmers.co.kr/learn/courses/30/lessons/142086

public class Prac142086 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String ss = "foobar";
        System.out.println(Arrays.toString(s.solution(ss)));
    }
}

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] a= s.split("");

        for (int i = 0; i < a.length; i++) {
            if(s.indexOf(a[i]) == i) {
                answer[i] = -1;
            } else {
                int cnt = 0;
                for (int j = 0; j < i; j++) {
                    if(a[i].equals(a[j])) {
                        cnt = j;
                    }
                }
                answer[i] = i-cnt;
            }

        }

        return answer;
    }
}