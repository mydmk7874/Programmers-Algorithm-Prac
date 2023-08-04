package prac12921_소수찾기;

//소수 찾기
//1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//(1은 소수가 아닙니다.)

import java.util.Arrays;

public class Prac12921 {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrimeNumber = new boolean[n+1];
        Arrays.fill(isPrimeNumber, true);
        isPrimeNumber[0] = false;
        isPrimeNumber[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(!isPrimeNumber[i]) {
                continue;
            }
            for (int j = 2*i; j <= n ; j += i) {
                isPrimeNumber[j] = false;
            }
        }
        for(boolean a : isPrimeNumber) {
            if(a) answer++;
        }

        return answer;
    }
}