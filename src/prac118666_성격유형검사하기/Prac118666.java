package prac118666_성격유형검사하기;

//성격 유형 검사하기
//https://school.programmers.co.kr/learn/courses/30/lessons/118666

public class Prac118666 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] survey = {};
        int[] choices = {};
        System.out.println(s.solution(survey, choices));
    }
}

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = new int[4];

        for (int i = 0; i < survey.length; i++) {
            switch (survey[i]) {
                case "RT" :
                    score[0] += choices[i] - 4;
                    break;
                case "TR" :
                    score[0] -= choices[i] - 4;
                    break;
                case "CF" :
                    score[1] += choices[i] - 4;
                    break;
                case "FC" :
                    score[1] -= choices[i] - 4;
                    break;
                case "JM" :
                    score[2] += choices[i] - 4;
                    break;
                case "MJ" :
                    score[2] -= choices[i] - 4;
                    break;
                case "AN" :
                    score[3] += choices[i] - 4;
                    break;
                case "NA" :
                    score[3] -= choices[i] - 4;
                    break;
                default: break;
            }
        }

        if(score[0] <= 0) answer += "R"; else answer += "T";
        if(score[1] <= 0) answer += "C"; else answer += "F";
        if(score[2] <= 0) answer += "J"; else answer += "M";
        if(score[3] <= 0) answer += "A"; else answer += "N";


        return answer;
    }
}


//사람들은 다들 HashMap 써서 풀더라.