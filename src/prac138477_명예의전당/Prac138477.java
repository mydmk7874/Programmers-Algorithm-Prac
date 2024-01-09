package prac138477_명예의전당;

//명예의 전당
//https://school.programmers.co.kr/learn/courses/30/lessons/138477

import java.util.Arrays;
import java.util.PriorityQueue;

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

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);

            if(pq.size() > k) {
                pq.poll();
            }

            answer[i] = pq.peek();
        }

        return answer;
    }
}


//class Solution {
//    public int[] solution(int k, int[] score) {
//        int[] answer = new int[score.length];
//        int[] honor = new int[k]; // 그날그날의 명예의 전당으로 쓸 배열
//        Arrays.fill(honor, -1);
//
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < k; j++) {
//                if (score[i] > honor[j]) { // 그날 새로 들어온 점수가 명예의 전당 가입조건이 되는지 체크
//                    int l = k-1; // l은 honor(명예의 전당) 인덱스용 숫자
//                    while (l > j) { // 가입조건 달성 등수 이하를 밀어내고
//                        honor[l] = honor[l - 1];
//                        l--;
//                    }
//                    honor[j] = score[i]; // 해당 등수 자리에 그날의 점수를 등록
//                    break;
//                }
//            } // 그날의 명예의전당 정리가 끝나면 -1이 아닌 명예의전당 점수중 가장 작은 값을 answer에 등록
//            answer[i] = Arrays.stream(honor).filter(a -> a>=0).min().getAsInt();
//        }
//        return answer;
//    }
//}


//PriorityQueue 쓰는 풀이 엄청 간단하더라. 꼭 그거 아니어도 ArrayList같은거 정렬기능 쓰면 훨씬 편함.
