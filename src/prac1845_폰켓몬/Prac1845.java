package prac1845_폰켓몬;

//폰켓몬
//https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.ArrayList;

public class Prac1845 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,3,3,2,2,4};
        System.out.println(s.solution(nums));
    }
}

class Solution {
    public int solution(int[] nums) {

        ArrayList<Integer> aa = new ArrayList<>();
        for(int a : nums) {
            if(!aa.contains(a)) {
                aa.add(a);
            }
        }
        return Math.min(nums.length/2, aa.size());
    }
}