package prac86491;

import java.util.Arrays;
//최소직사각형
//모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
public class Prac86491 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] width=new int[sizes.length];
        int[] height=new int[sizes.length];

        for(int i=0;i<sizes.length;i++){
            width[i]= (Math.max(sizes[i][0], sizes[i][1]));
            height[i]= (Math.min(sizes[i][0], sizes[i][1]));
        }
        Arrays.sort(width);
        Arrays.sort(height);

        answer = width[width.length-1]*height[height.length-1];

        return answer;
    }
}