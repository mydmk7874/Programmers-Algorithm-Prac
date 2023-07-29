package prac132267_콜라문제;

//콜라 문제
//https://school.programmers.co.kr/learn/courses/30/lessons/132267

public class Prac132267 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int a = 4;
        int b = 3;
        int n = 491;
        System.out.println(s.solution(a,b,n));
    }
}

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n/a>0) {
            answer += (n/a)*b;
            n = (n/a)*b + n%a;
        }
        return answer;
    }
}