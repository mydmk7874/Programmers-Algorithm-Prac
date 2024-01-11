package prac12914_멀리뛰기;

//멀리 뛰기

//효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다.
// 칸이 총 4개 있을 때, 효진이는
//(1칸, 1칸, 1칸, 1칸)
//(1칸, 2칸, 1칸)
//(1칸, 1칸, 2칸)
//(2칸, 1칸, 1칸)
//(2칸, 2칸)
//의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다.
// 멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내,
// 여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요.
// 예를 들어 4가 입력된다면, 5를 return하면 됩니다.
public class Prac12914 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 2000;
        System.out.println(s.solution(n));
    }
}

class Solution {
    public long solution(int n) {

        if(n == 1) {
            return 1;
        }

        long[] way = new long[n];

        way[0] = 1;
        way[1] = 2;

        if(n == 2) {
            return 2;
        } else {
            for (int i = 2 ; i < n; i++) {
                way[i] = (way[i-1] + way[i-2]) % 1234567;
            }

            return way[n-1];
        }
    }
}


//아름다운 재귀함수 짜놨더니 시간초과로 빠꾸먹인다. 망겜.
//class Solution {
//    public long solution(int n) {
//        long answer = 0;
//
//        answer = dfs(0, n)%1234567;
//
//        return answer;
//    }
//
//    public long dfs(int i, int n) {
//        if(i <= n) {
//            if (i == n) {
//                return 1;
//            }
//            return dfs(i+1, n)+dfs(i+2, n);
//        }
//
//        return 0;
//    }
//}