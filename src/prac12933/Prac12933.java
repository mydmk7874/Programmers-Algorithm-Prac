package prac12933;

import java.util.*;


public class Prac12933 {
    public static void main(String[] args) {
        Solution s = new Solution();
        long n = 8941814651L;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        long m = n;
        int digit = 0;
        while (m>0) {
            m = m/10;
            digit++;
        }

        long[] arr = new long[digit];
        for(int i=0;i<digit;i++) {
            arr[i] = n%10;
            n = n/10;
//            System.out.println(Arrays.toString(arr));
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for(int j = digit-1;j >= 0;j--) {
            answer = (answer*10) + arr[j];
        }

        return answer;
    }
}

//김주희님 답안
//class Solution {
//    public long solution(long n) {
//        long answer;                //첫번째 푼 방법//
//        double d = Math.sqrt(n);    //double형 d라는 변수에 Math.sqrt를 사용하여 제곱하였을때 n값이 되는 수를 대입한다.
//
//        answer = (long)(d % 1 == 0 ? Math.pow(d + 1, 2) : -1);  //이 d값이 만약 1로 나누어 떨어졌을 때 참이면,(1로 나누어 떨어지면 소수점이 없는 정수겠죠?)
//        //해당 d값에 +1하여 제곱한 값을 long형으로 바꿔 answer에 대입해주고,(pow 함수로 제곱할 수 있다. 2의 3제곱을 구하려면, Math.pow(2, 3))
//        return answer;                                          //그게 아니라면 그냥 -1을 받아 long형으로 바꾸어 answer에 대입해준다.
////        long answer;
////        answer = (long)(Math.sqrt(n) % 1 == 0 ? (Math.sqrt(n) + 1) * (Math.sqrt(n) + 1) : -1);
//
//        //return answer;
//    }
//}