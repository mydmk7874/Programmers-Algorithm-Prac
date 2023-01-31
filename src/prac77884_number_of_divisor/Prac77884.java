package prac77884_number_of_divisor;

//약수의 개수와 덧셈
//두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
// 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
public class Prac77884 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int left = 24;
        int right = 27;
        System.out.println(s.solution(left,right));
    }
}


class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[] arr = new int[right-left+1];
        for(int i=0; i < arr.length; i++) {
            arr[i] = left+i;
        }

        for(int i=0; i < arr.length; i++) {
            Double sqrt = Math.sqrt(arr[i]);
            if(sqrt == sqrt.intValue()) {
                answer -= arr[i];
            } else {
                answer += arr[i];
            }
        }
        return answer;
    }
}