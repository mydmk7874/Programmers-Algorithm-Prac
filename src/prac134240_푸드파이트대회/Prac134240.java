package prac134240_푸드파이트대회;

//푸드 파이트 대회
//https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class Prac134240 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] food = {1, 3, 4, 6};
        System.out.println(s.solution(food));
    }
}

class Solution {
    public String solution(int[] food) {
        StringBuilder sb= new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }

        StringBuilder sb2 = new StringBuilder(sb);

        sb.append(0);
        sb2.reverse();
        sb.append(sb2);
        return sb.toString();
    }
}

//다른풀이

//class Solution {
//    public String solution(int[] food) {
//        String answer = "0";
//
//        for (int i = food.length - 1; i > 0; i--) {
//            for (int j = 0; j < food[i] / 2; j++) {
//                answer = i + answer + i;
//            }
//        }
//
//        return answer;
//    }
//}
//class Solution {
//    public String solution(int[] food) {
//        StringBuilder builder = new StringBuilder();
//        for (int i=1; i<food.length; i++) {
//            int result = food[i] / 2;
//            builder.append(String.valueOf(i).repeat(result));
//        }
//        String answer = builder + "0";
//        return answer + builder.reverse();
//    }
//}