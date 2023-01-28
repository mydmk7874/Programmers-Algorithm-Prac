package prac68935;

//3진법 뒤집기
//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요
public class Prac68935 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 45;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String m = Integer.toString(n,3);
//
//        StringBuilder sb = new StringBuilder(m);
//
//        sb.reverse();
//        String mReverse = sb.toString();

        String mReverse = "" ;
        mReverse = new StringBuilder(m).reverse().toString();

        answer = Integer.parseInt(mReverse, 3);

        return answer;
    }
}