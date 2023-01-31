package prac12928_sum_of_divisor;

//약수의 합
//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
public class Prac12928 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int n = 12;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer += n;

        for(int i=1;i <= n/2; i++) {
            if(n%i==0) {
                answer += i;
            }
        }

        return answer;
    }
}