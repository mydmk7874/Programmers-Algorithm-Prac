package prac12982_budget;

import java.util.*;

//예산
//부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
// 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.

public class Prac12982 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] d= {1,3,2,5,4};
        int budget = 9;
        System.out.println(s.solution(d, budget));
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = d.length;

        int sum = 0;
        for(int i : d) {
            sum += i;
        }

        Arrays.sort(d);

        ArrayList<Integer> dList = new ArrayList<>();
        for(int i : d) {
            dList.add(i);
        }

        while(sum > budget) {
            sum -= dList.get(dList.size()-1);
            dList.remove(dList.size()-1);
            answer--;
        }

        return answer;
    }
}