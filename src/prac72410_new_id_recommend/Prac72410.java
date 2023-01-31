package prac72410_new_id_recommend;

//신규 아이디 추천
//"네오"는 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가
// 카카오 아이디 규칙에 맞는 지 검사하고규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천해 주려고 합니다.

public class Prac72410 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String new_id = "...";
        System.out.println(s.solution(new_id));
    }
}

class Solution {
    public String solution(String new_id) {

        //step1 대소문자 변환

        String step1 = new_id.toLowerCase();

        //step2 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거

        String step2 = step1.replaceAll("[^a-z0-9-_.]","");

        //step3 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환

        String step3 = step2.replaceAll("\\.{2,}","."); //  "/\\.{2,}/" 이거 왜안됨?

        //step4 마침표(.)가 처음이나 끝에 위치한다면 제거

        String step4 = step3;

        if(step3.startsWith(".")) {
            step4 = step3.substring(1);
        }

        if(step4.endsWith(".")) {
            step4 = step4.substring(0,step4.length()-1);
        }

        //step5 빈 문자열이라면, new_id에 "a"를 대입

        String step5 = step4;

        if(step5.equals("")) {
            step5 = "a";
        }

        //step6 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거

        String step6 = step5;

        if(step6.length()>15) {
            step6= step6.substring(0,15);
        }

        if(step6.endsWith(".")) {
            step6 = step6.substring(0,step6.length()-1);
        }

        //step7 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다

        String step7 = step6;

        while(step7.length()<3) {
            step7 = step7.concat(""+step7.charAt(step7.length()-1));
        }

        return step7;
    }
}