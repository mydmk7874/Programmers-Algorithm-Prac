package prac138477_명예의전당;

//명예의 전당
//https://school.programmers.co.kr/learn/courses/30/lessons/138477

import java.util.Arrays;

public class Prac138477 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(s.solution(k,score)));
    }
}

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] honor = new int[k];
        Arrays.fill(honor, -1);

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < k; j++) {
                if (score[i] > honor[j]) {
                    int l = k-1;
                    while (l > j) {
                        honor[l] = honor[l - 1];
                        l--;
                    }
                    honor[j] = score[i];
                    break;
                }
            }
            answer[i] = Arrays.stream(honor).filter(a -> a>=0).min().getAsInt();
        }
        return answer;
    }
}


//PriorityQueue 쓰는 풀이 엄청 간단하더라. 꼭 그거 아니어도 ArrayList같은거 정렬기능 쓰면 훨씬 편함.
