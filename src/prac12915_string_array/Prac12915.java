package prac12915_string_array;

import java.util.*;

//문자열 내 마음대로 정렬하기
//문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
// 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
public class Prac12915 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(Arrays.toString(s.solution(strings,n)));
    }
}


class Solution {
    public String[] solution(String[] strings, int n) {
        char[] nthchar = new char[strings.length];

        for(int i=0; i<strings.length; i++) {
            nthchar[i] = strings[i].charAt(n);
        }

        Arrays.sort(strings);
        Arrays.sort(nthchar);

        String[] answer = new String[strings.length];
        int nthcharindex = 0;

        boolean[] isstringused= new boolean[strings.length];

        while(nthcharindex < strings.length) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].charAt(n) == nthchar[nthcharindex] && isstringused[i] == false) {
                    answer[nthcharindex] = strings[i];
                    isstringused[i] = true;
                    nthcharindex++;
                    break;
                }
            }
        }

        return answer;
    }
}