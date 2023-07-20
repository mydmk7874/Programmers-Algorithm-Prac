package prac12912_두정수사이의합;

//두 정수 사이의 합
//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
public class Prac12912 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int a= 312;
        int b= 1994;
        System.out.println(s.solution(a,b));
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int aa= Math.min(a,b);
        int bb= Math.max(a,b);
        for (int i = aa; i < bb+1; i++) {
            answer += i;
        }

        return answer;
    }
}