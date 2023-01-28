package prac12934;

public class Prac12934 {
    public static void main(String[] args) {
        Solution s = new Solution();
        long n = 610926697924L;
        System.out.println(s.solution(n));
    }
}


class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = 0;
        while (true) {
            if (n == x * x) {
                answer = (x+1)*(x+1);
                break;
            }
            if (n <= x*x){
                answer = -1;
                break;
            }
            x++;

        }

        return answer;
    }
}