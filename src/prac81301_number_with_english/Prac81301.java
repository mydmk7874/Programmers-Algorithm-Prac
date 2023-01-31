package prac81301_number_with_english;

//숫자 문자열과 영단어
//s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
public class Prac81301 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "2three45sixseven";
        System.out.println(sol.solution(s));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;

        String temp;

        temp = s.replace("one","1").replace("two","2").replace("three","3").replace("four","4").replace("five","5").replace("six","6").replace("seven","7").replace("eight","8").replace("nine","9").replace("zero","0");

        answer = Integer.parseInt(temp);

        return answer;
    }
}