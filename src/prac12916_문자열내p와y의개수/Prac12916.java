package prac12916_문자열내p와y의개수;

//문자열 내 p와 y의 개수
//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
// 다르면 False를 return 하는 solution를 완성하세요.
// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
public class Prac12916 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String ss = "Pyy";
        System.out.println(s.solution(ss));
    }
}


class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int b=0;
        s = s.toLowerCase();
        char[] a= s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 'p') b++;
            if(a[i] == 'y') b--;
        }

        if(b != 0) answer = false;

        return answer;
    }
}

//다른풀이1
//class Solution {
//    boolean solution(String s) {
//        s = s.toUpperCase();
//
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
//    }
//}

//다른풀이2
//class Solution {
//    boolean solution(String s) {
//        s = s.toLowerCase();
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (s.charAt(i) == 'p')
//                count++;
//            else if (s.charAt(i) == 'y')
//                count--;
//        }
//
//        if (count == 0)
//            return true;
//        else
//            return false;
//    }
//}