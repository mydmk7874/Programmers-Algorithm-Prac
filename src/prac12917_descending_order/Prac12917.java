package prac12917_descending_order;

import java.util.*;

//문자열 내림차순으로 배치하기
//문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
public class Prac12917 {
    public static void main(String[] args) {
        Solution sol= new Solution();
        String s= "Zbcdefg";
        System.out.println(sol.solution(s));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ss = s.toCharArray();

        Arrays.sort(ss);

        String chartostr = new String(ss);

        StringBuilder sb = new StringBuilder(chartostr).reverse();

        answer = sb.toString();

        return answer;
    }
}