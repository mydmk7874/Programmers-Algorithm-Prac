package prac12940_gcd_lcm;

import java.util.*;

//최대공약수와 최소공배수
//두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
// 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
// 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
public class Prac12940 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int n = 55;
        int m = 26;
        System.out.println(Arrays.toString(s.solution(n,m)));
    }
}

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        ArrayList<Integer> nList = new ArrayList<>();
        ArrayList<Integer> mList = new ArrayList<>();

        for (int i = 1; i < n / 2 + 1; i++) {
            if(n%i == 0) {
                nList.add(i);
            }
        }

        nList.add(n);

        for (int i = 1; i < m / 2 + 1; i++) {
            if(m%i == 0) {
                mList.add(i);
            }
        }

        mList.add(m);

        for(int i = 1; i <= Math.min(n,m); i++) {
            if(nList.contains(i) && mList.contains(i)) {
                answer[0] = i;
            }
        }

        answer[1] = n*m;

        for (Integer nn : nList) {
            for (Integer mm : mList) {
                if (nn * mm >= Math.max(n , m)) {
                    if (nn * mm % n == 0 && nn * mm % m == 0) {
                        answer[1] = Math.min(answer[1], nn*mm);
                    }
                }
            }

        }

        return answer;
    }
}


/* 주희님 답안 최대공약수 부분
    //GCD, 최대공약수
    int gcd = -1; //최대공약수를 담을 변수는 우선 -1로 초기화 해주고,
for (int i : (ArrayList<Integer>)arrN) { //arrN에 담긴 N의 약수와
        for (int j : (ArrayList<Integer>)arrM) { //arrM에 담긴 M의 약수를 이중 for문으로 돌며,
        if (i == j) { //i와 j가 같을 때, 즉, N과 M의 약수가 같을 때
        if (gcd < i) { //gcd보다 큰 것을 비교하여
        gcd = i; //그 수를 gcd에 바꿔치기 해준다.
        }
        }
        }
        }

 */