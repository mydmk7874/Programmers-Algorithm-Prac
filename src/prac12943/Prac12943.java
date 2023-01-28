package prac12943;

public class Prac12943 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 626331;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public int solution(long num) {
        if (num == 1) {
            return 0;
        }
        int cnt = 0;

        while (!(num == 1)) {
            if(cnt==500)
                return -1;
            if(num%2 == 0) {
                num = num/2;
                cnt++;
                continue;
            }
            num = num*3 +1;
            cnt++;
        }

        return cnt;
    }
}
