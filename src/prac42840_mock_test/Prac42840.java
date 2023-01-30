package prac42840_mock_test;

import java.util.Arrays;

public class Prac42840 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answers = {1,3,2,4,2};
        System.out.println(Arrays.toString(s.solution(answers)));
    }
}

class Solution {
    public int[] solution(int[] answers) {
        int[] hit = new int[3];

        int[] pattern_first = {1,2,3,4,5};

        int[] pattern_second = {2, 1, 2, 3, 2, 4, 2, 5};

        int[] pattern_third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i=0; i< answers.length; i++) {
            if(answers[i] == pattern_first[i%5])
                hit[0]++;
            if(answers[i] == pattern_second[i%8])
                hit[1]++;
            if(answers[i] == pattern_third[i%10])
                hit[2]++;
        }

        int maxscore = hit[0];

        for(int i : hit) {
            if(i > maxscore) {
                maxscore = i;
            }
        }

        int maxscoretie = 0;

        for(int i : hit) {
            if(i == maxscore) {
                maxscoretie++;
            }
        }

        int[] answer = new int[maxscoretie];
        int answerindex = 0;

        for(int i=0;i <3;i++) {
            if(hit[i] == maxscore) {
                answer[answerindex] = i+1;
                answerindex++;
            }
        }

        return answer;
    }
}



//for(int i=0; i < hit.length-1; i++) {
//        for (int j=i+1; j < hit.length; j++) {
//        if (hit[i] < hit[j]) {
//        answermaxindex = j;
//        }
//
//        if (hit[i] == hit[j]) {
//        answerindex++;
//
//        }
//
//        }
//        }
//
//        if (hit[0] == hit[1]) answerlength++;
//                if (hit[1] == hit[2]) answerlength++;
//                if (hit[0] != hit[1] && hit[1] == hit[2]) answerlength++;
//
//                int[] answer = new int[answerlength];
//                int answerindex = 0;
//                answer[0] = 1;
//
//                for(int i=0;i<answer.length-1;i++) {
//        for(int j=i+1;j<answer.length;j++) {
//        if (hit[i] < hit[j]) {
//        answer[answerindex] = j+1;
//        }
//        if (hit[i] == hit[j]) {
//        answerindex++;
//        answer[answerindex] = j+1;
//        break;
//        }
//        }
//        }
