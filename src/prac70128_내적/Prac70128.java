package prac70128_내적;

//내적
//길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록
// solution 함수를 완성해주세요.
//
//이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
public class Prac70128 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] a= {1,4,55,6,2,-13,4};
        int[] b= {11,34,-2,134,9,92,5};
        System.out.println(s.solution(a,b));
    }
}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}

//다른풀이
//import java.util.stream.IntStream;
//
//class Solution {
//    public int solution(int[] a, int[] b) {
//        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
//    }
//}