package prac176963_추억점수;

//추억 점수
//https://school.programmers.co.kr/learn/courses/30/lessons/176963

import java.util.Arrays;

public class Prac176963 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String[] name = {"kali", "mari", "don"};
        int[] yearning = {11, 1, 55};
        String[][] photo = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        System.out.println(Arrays.toString(s.solution(name, yearning, photo)));
    }
}

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if(photo[i][j].equals(name[k])) {
                        answer[i] += yearning[k];
                    }
                }
            }
        }
        return answer;
    }
}


//stream 사용 풀이
//import java.util.*;
//        import java.util.stream.*;
//
//class Solution {
//    public int[] solution(String[] name, int[] yearning, String[][] photo) {
//        Map<String, Integer> map = IntStream.range(0, name.length).mapToObj(operand -> Map.entry(name[operand], yearning[operand])).collect(Collectors.toSet()).stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        return Arrays.stream(photo).mapToInt(strings -> Arrays.stream(strings).mapToInt(value -> map.getOrDefault(value, 0)).sum()).toArray();
//    }
//}

//HashMap 사용 풀이
//import java.util.*;
//class Solution {
//    public int[] solution(String[] name, int[] yearning, String[][] photo) {
//        int[] answer = new int[photo.length];
//        HashMap<String,Integer> map = new LinkedHashMap<>();
//        for(int i=0; i< name.length; i++){
//            map.put(name[i],yearning[i]);
//        }
//
//        for(int i =0; i< photo.length;i++){
//            String[] persons = photo[i];
//            int score = 0;
//            for(int j=0; j<persons.length; j++){
//                String person = persons[j];
//                if(map.containsKey(person)){
//                    score+=map.get(person);
//                }
//            }
//            answer[i]=score;
//        }
//
//        return answer;
//
//
//    }
//}