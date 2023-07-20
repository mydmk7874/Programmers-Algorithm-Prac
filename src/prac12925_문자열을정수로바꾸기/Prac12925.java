package prac12925_문자열을정수로바꾸기;

//문자열을 정수로 바꾸기
//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
public class Prac12925 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String ss= "-48913";
        System.out.println(s.solution(ss));
    }
}

class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}