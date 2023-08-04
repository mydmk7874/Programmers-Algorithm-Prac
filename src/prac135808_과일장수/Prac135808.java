package prac135808_과일장수;

//과일 장수
//https://school.programmers.co.kr/learn/courses/30/lessons/135808

import java.util.*;
import java.util.stream.Collectors;

public class Prac135808 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(s.solution(k,m,score));
    }
}


class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> aa = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
        for(int i = 0; i < aa.size()/m ; i++) {
            answer += m*aa.get(m*i+m-1);
        }

        return answer;
    }
}

//다른풀이
//import java.util.*;
//
//class Solution {
//    public int solution(int k, int m, int[] score) {
//        int answer = 0;
//
//        Arrays.sort(score);
//
//        for(int i = score.length; i >= m; i -= m){
//            answer += score[i - m] * m;
//        }
//
//        return answer;
//    }
//}