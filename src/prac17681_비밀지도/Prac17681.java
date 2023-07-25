package prac17681_비밀지도;

import java.util.Arrays;

//비밀지도
//https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class Prac17681 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int n= 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(s.solution(n, arr1, arr2)));
    }
}

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");
        String[][] arr1s = new String[n][n];
        String[][] arr2s = new String[n][n];

        for (int i = 0; i < n; i++) {
            int aa= arr1[i];
            int bb= arr2[i];
            System.out.println(Integer.toBinaryString(arr1[i]));
            for (int j = n-1; j >= 0; j--) {
                arr1s[i][j] = aa%2 == 0 ? "0" : "1";
                arr2s[i][j] = bb%2 == 0 ? "0" : "1";
                aa = aa/2;
                bb = bb/2;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr1s[i][j].equals("0") && arr2s[i][j].equals("0")) {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
        }

        return answer;
    }
}

//신박한 풀이들 많더라 한번 다시 보러가자