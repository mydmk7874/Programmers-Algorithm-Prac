package prac77884_number_of_divisor;

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