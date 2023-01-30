package prac68644;

import java.lang.reflect.Array;
import java.util.*;

//두 개 뽑아서 더하기
//정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
// 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.


public class Prac68644 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2,1,3,4,1};
        System.out.println(Arrays.toString(s.solution(numbers)));
    }
}


class Solution {
    public int[] solution(int[] numbers) {

        int[] sumarr = new int[numbers.length*(numbers.length-1)/2];
        int sumindex = 0;

        for(int i=0;i < numbers.length-1;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                sumarr[sumindex] = numbers[i]+numbers[j];
                sumindex++;
            }
        }

        Arrays.sort(sumarr);

        int count = 0;

        for (int i=1; i < sumarr.length;i++) {
            if (sumarr[i] == sumarr[i-1]) {
                count++;
            }
        }

        int[] answer = new int[sumarr.length-count];
        int index = 1;
        answer[0] = sumarr[0];

        for(int i=1;i<sumarr.length;i++){
            if (!(sumarr[i]==sumarr[i-1])) {
                answer[index] = sumarr[i];
                index++;
            }
        }

        return answer;
    }
}