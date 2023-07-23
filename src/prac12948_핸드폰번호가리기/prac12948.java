package prac12948_핸드폰번호가리기;

//핸드폰 번호 가리기
//프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린
// 문자열을 리턴하는 함수, solution을 완성해주세요.
public class prac12948 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String pn= "01012389401";
        System.out.println(s.solution(pn));
    }
}

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder(phone_number);
        for (int i = 0; i < sb.length()-4; i++) {
            sb.setCharAt(i,'*');
        }
        answer= sb.toString();
        return answer;
    }
}

//다른풀이
//class Solution {
//    public String solution(String phone_number) {
//        char[] ch = phone_number.toCharArray();
//        for(int i = 0; i < ch.length - 4; i ++){
//            ch[i] = '*';
//        }
//        return String.valueOf(ch);
//    }
//}
//class Solution {
//    public String solution(String phone_number) {
//        return phone_number.replaceAll(".(?=.{4})", "*");
//    }
//}