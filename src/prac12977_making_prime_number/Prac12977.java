package prac12977_making_prime_number;

import java.util.*;

//소수 만들기
//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
// 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

public class Prac12977 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] nums= {1,2,7,6,4};
        System.out.println(s.solution(nums));
    }
}

class Solution {
    public int solution(int[] nums) {
        int[] sum = new int[nums.length*(nums.length-1)*(nums.length-2)/6];
        int sumindex = 0;

        for(int i=0;i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1;j++) {
                for(int k=j+1; k<nums.length;k++) {
                    sum[sumindex] = nums[i]+nums[j]+nums[k];
                    sumindex++;
                }
            }
        }

        int primecount = 0;
        Arrays.sort(sum);
        boolean[] isnotprimenumber = new boolean[sum.length];

        for(int i=2;i<sum[0]/2+1;i++) {
            if (sum[0]%i==0) {
                isnotprimenumber[0] = true;
                break;
            }
        }

        for (int i = 1; i < sum.length; i++) {
            for (int j = 2; j < sum[i] / 2 + 1; j++) {
                if (sum[i] % j == 0) {
                    isnotprimenumber[i] = true;
                    break;
                }
            }
        }

        for(boolean i : isnotprimenumber) {
            if(!i) {
                primecount++;
            }
        }

        return primecount;
    }
}