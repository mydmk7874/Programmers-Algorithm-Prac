package prac12939_최댓값과최솟값;

//최댓값과 최솟값
//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중
// 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

public class Prac12939 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String ss = "-1 -2 -3 -4";
        System.out.println(s.solution(ss));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] ss = s.split(" ");
        int[] sss = new int[ss.length];

        for (int i = 0; i < ss.length; i++) {
            sss[i] = Integer.parseInt(ss[i]);
        }

        int a = sss[0];
        int b = sss[0];
        for (int i = 1; i < sss.length; i++) {
            if(sss[i] < a) {
                a = sss[i];
                continue;
            }
            if(sss[i] > b) {
                b = sss[i];
            }
        }

        answer = a+" "+b;
        return answer;
    }
}

//다른풀이
//public String getMinMaxString(String str) {
//    String[] tmp = str.split(" ");
//    int min, max, n;
//    min = max = Integer.parseInt(tmp[0]);
//    for (int i = 1; i < tmp.length; i++) {
//        n = Integer.parseInt(tmp[i]);
//        if(min > n) min = n;
//        if(max < n) max = n;
//    }
//
//    return min + " " + max;
//
//}