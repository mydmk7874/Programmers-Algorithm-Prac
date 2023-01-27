package prac12922;

public class Prac12922 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 59;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i=1; i<=n; i++){
            if (i%2 == 1) {
                answer = answer + "수";
            } else {
                answer = answer + "박";
            }
        }
        return answer;
    }
}