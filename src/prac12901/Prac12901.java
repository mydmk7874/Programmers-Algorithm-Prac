package prac12901;

public class Prac12901 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int a=5,b=24;
        System.out.println(s.solution(a,b));

    }
}

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i=0;i < a-1;i++) {
            sum += month[i];
        }
        sum = sum + b;
        switch (sum%7){
            case 0 :
                answer = "THU";
                break;
            case 1 :
                answer = "FRI";
                break;
            case 2 :
                answer = "SAT";
                break;
            case 3 :
                answer = "SUN";
                break;
            case 4 :
                answer = "MON";
                break;
            case 5 :
                answer = "TUE";
                break;
            case 6 :
                answer = "WED";
                break;
        }
        return answer;
    }
}