package prac12944_average;

//평균 구하기
//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

public class prac12944 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr= {1,2,3,4};
        System.out.println(s.solution(arr));
    }
}


class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int j : arr) {
            answer += j;
        }

        answer = answer / arr.length;
        return answer;
    }
}