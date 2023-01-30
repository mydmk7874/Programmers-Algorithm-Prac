package prac12906;

import java.util.*;

//같은 숫자는 싫어
//배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
//배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
public class Prac12906 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}

class Solution {
    public int[] solution(int []arr) {
        int count = 0;

        for (int i=1; i < arr.length;i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            }
        }

        int[] answer = new int[arr.length-count];
        int index = 1;
        answer[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            if (!(arr[i]==arr[i-1])) {
                answer[index] = arr[i];
                index++;
            }
        }

        return answer;
    }
}