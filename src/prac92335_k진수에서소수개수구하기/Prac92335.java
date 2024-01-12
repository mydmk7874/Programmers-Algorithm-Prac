package prac92335_k진수에서소수개수구하기;

//k진수에서 소수 개수 구하기
//https://school.programmers.co.kr/learn/courses/30/lessons/92335

import java.util.Arrays;

public class Prac92335 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 110011;
        int k = 10;
        System.out.println(s.solution(n,k));
    }
}

class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        String[] numbers = Integer.toString(n, k).split("0");

        long[] numbersInt = Arrays.stream(numbers).filter(i -> !i.equals("")).mapToLong(Long::parseLong).toArray();

        for (long i : numbersInt) {
            if(isPrime(i)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isPrime(long n) {

        if(n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}