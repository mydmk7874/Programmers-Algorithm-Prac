package prac159994_카드뭉치;

//카드 뭉치
//https://school.programmers.co.kr/learn/courses/30/lessons/159994

public class Prac159994 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(s.solution(cards1,cards2,goal));

    }
}

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        int b = 0;
        int g = 0;

        while (g < goal.length) {
            if (a == cards1.length) {

            } else if(cards1[a].equals(goal[g])) {
                a++;
                g++;
                continue;
            }

            if(b == cards2.length) {
                return "No";
            } else if(cards2[b].equals(goal[g])) {
                b++;
                g++;
                continue;
            }

            return "No";
        }
        return "Yes";
    }
}