package prac12918_문자열다루기기본;

//문자열 다루기 기본
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
// 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
public class Prac12918 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String ss= "4981w";
        System.out.println(s.solution(ss));
    }
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() ==6) {
            char[] a= s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if(a[i] < '0' || a[i] > '9' ) {
                    answer = false;
                }
            }
        } else answer = false;
        return answer;
    }
}

//다른풀이들
//class Solution { - 이건 되긴하는데 문제풀이에서 예외처리 쓰지 말자
//    public boolean solution(String s) {
//        if(s.length() == 4 || s.length() == 6){
//            try{
//                int x = Integer.parseInt(s);
//                return true;
//            } catch(NumberFormatException e){
//                return false;
//            }
//        }
//        else return false;
//    }
//}

//import java.util.*;
//
//class Solution {
//    public boolean solution(String s) {
//        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;
//    }
//} return s.matches("\\d{4}|\\d{6}");얘써도됨
//return s.matches("[0-9]{4}|[0-9]{6}");얘써도됨

//class Solution {
//    public boolean solution(String s) {
//        return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
//    }
//}