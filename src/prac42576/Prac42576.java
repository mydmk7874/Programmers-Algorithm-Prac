package prac42576;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Prac42576 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] p ={"mislav", "stanko", "mislav", "ana"};
        String[] c = {"mislav", "ana", "mislav"};
        System.out.println(s.solution(p,c));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
//        System.out.println(Arrays.toString(participant));

        Arrays.sort(completion);
//        System.out.println(Arrays.toString(completion));

        for (int i=0;i < completion.length;i++) {
                if (!(Objects.equals(participant[i], completion[i]))) {
                    answer = participant[i];
                    break;
                }
            }
        if (answer.equals("")) {
            answer = participant[participant.length-1];
        }

        return answer;
    }
}


//        권성민님 솔루션

//        String answer = "";
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < participant.length; i++) {
//            if (map.containsKey(participant[i])) {
//                map.put(participant[i], map.get(participant[i]) + 1);
//            }
//            else {
//                map.put(participant[i], 1);
//            }
//        }
//
//        for (int i = 0; i < completion.length; i++) {
//            if (map.containsKey(completion[i])) {
//                map.put(completion[i], map.get(completion[i]) - 1);
//            }
//        }
//
//        for (String s : map.keySet()) {
//            if (map.get(s) == 1) {
//                answer = s;
//                break;
//            }
//        }
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for (int i = 0; i < completion.length; i++) {
//            if (!participant[i].equals(completion[i])) {
//                answer = participant[i];
//                break;
//            }
//        }
//
//        if (answer.isEmpty()) {
//            answer = participant[participant.length - 1];
//        }
//
//        return answer;
//    }
//}