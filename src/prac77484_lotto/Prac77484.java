package prac77484_lotto;
//로또의 최고 순위와 최저 순위
//민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다.
// 이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.


import java.util.Arrays;

public class Prac77484 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        System.out.println(Arrays.toString(s.solution(lottos,win_nums)));
    }
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int hit = 0;
        int zero = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zero++;
                continue;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum)
                    hit++;
            }
        }

        if(2 <=hit+zero && hit+zero <=6) {
            answer[0] = 7-(hit+zero);
        } else {
            answer[0] = 6;
        }

        if(2 <=hit && hit <=6) {
            answer[1] = 7-(hit);
        } else {
            answer[1] = 6;
        }

        return answer;
    }
}