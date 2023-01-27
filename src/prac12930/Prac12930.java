package prac12930;

import java.util.*;

public class Prac12930 {
    public static void main(String[] args) {

        String s = "everybody    put your hands up    ";

        Solution solution = new Solution();

        String answer = solution.solution(s);

        System.out.println(answer);

    }
}

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] list=s.toCharArray();

        for (int a=0;a<list.length;a++) {
            if (65 <= list[a] && list[a] <= 90) {
                list[a] += 32;
            }
        }

        for (int k=0;k<list.length;k++){
            if(97 <= list[k] && list[k] <= 122) {
                list[k] -= 32;
                break;
            }
        }

        int i=1;
        while(i<list.length){
            if (list[i] ==' ') {
                if (!(i == list.length - 1)) {
                    if (97 <= list[i + 1] && list[i + 1] <= 122) {
                        list[i + 1] -= 32;
                        i++;
                        continue;
                    }
                }
            }
            if (list[i] != ' ' && 97 <= list[i-1] && list[i-1] <= 122) {
                list[i] -= 32;
            }

            i++;
        }

        for (int j=0;j <list.length;j++){
            answer.append(list[j]);
        }

        return answer.toString();
    }
}



//권성민님 답안
//class SolutionbyGwon {
//    public String solutionbygwon(String s) {
//        String answer;
//
//        s = s.toLowerCase();
//
//        String[] arr = s.split(" ", -1);
//
//        for (int i = 0; i < arr.length; i++) {
//            String[] arr2 = arr[i].split("");
//            for (int j = 0; j < arr[i].length(); j++) {
//                if (j % 2 == 0) {
//                    arr2[j] = arr2[j].toUpperCase();
//                }
//            }
//            arr[i] = String.join("", arr2);
//        }
//
//        answer = String.join(" ", arr);
//
//        return answer;
//    }
//}