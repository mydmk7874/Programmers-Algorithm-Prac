package prac12903_가운데글자가져오기;

//가운데 글자 가져오기
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
// 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
public class Prac12903 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String ss= "qpowejdqs";
        System.out.println(s.solution(ss));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        int a= s.length();

        if(a%2==0) {
            answer = s.substring(a/2-1,a/2+1);
        } else {
            answer = s.charAt(a/2)+"";
        }
        return answer;
    }
}