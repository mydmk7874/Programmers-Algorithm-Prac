package prac12953_N개의최소공배수;

//N개의 최소공배수
//두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
//예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서,
// n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
// n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
public class Prac12953 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr = {2,6,8,14};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[] arr) {
        int a = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(Math.max(a, arr[i])%Math.min(a, arr[i]) == 0) {
                a = Math.max(a, arr[i]);
                continue;
            }
            int gcd = 1;

            for (int j = 2; j <= Math.min(a,arr[i])/2; j++) {
                if(a % j == 0 && arr[i] % j == 0) {
                    gcd = j;
                }
            }
            a = arr[i]* a / gcd;
        }

        return a;
    }
}

//다른풀이
//public long nlcm(int[] num) {
//    long answer = num[0], g;
//    for (int i = 1; i < num.length; i++) {
//        g = gcd(answer, num[i]);
//        answer = g * (answer / g) * (num[i] / g);
//    }
//    return answer;
//}
//
//    public long gcd(long a, long b) {
//        if (a > b)
//            return (a % b == 0) ? b : gcd(b, a % b);
//        else
//            return (b % a == 0) ? a : gcd(a, b % a);
//    }