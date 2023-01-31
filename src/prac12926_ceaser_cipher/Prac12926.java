package prac12926_ceaser_cipher;

//시저 암호
//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
// 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

public class Prac12926 {
    public static void main(String[] args) {
        Solution sol= new Solution();
        String s = "a B z";
        int n = 4;
        System.out.println(sol.solution(s,n));
    }
}


class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        char[] temp = s.toCharArray();

        for(int i=0; i < temp.length; i++) {
            if (65 <= temp[i] && temp[i] <=90) {
                temp[i] += n;
                if(temp[i] >90) {
                    temp[i] -= 26;
                }
            }
            if (97 <= temp[i] && temp[i] <=122) {
                temp[i] += n;
                if(temp[i] >122) {
                    temp[i] -= 26;
                }
            }
        }

        for (char c : temp) {
            answer.append(c);
        }

        return answer.toString();
    }
}