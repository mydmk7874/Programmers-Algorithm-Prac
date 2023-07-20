package prac12919_서울에서김서방찾기;
//서울에서 김서방 찾기
//String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
// "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
// seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
public class Prac12919 {
    public static void main(String[] args) {
        Solution s= new Solution();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(s.solution(seoul));
    }
}


class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt=0;
        for(int i=0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                cnt= i;
                break;
            }
        }
        answer = "김서방은 "+ cnt + "에 있다";
        return answer;
    }
}
//다른풀이

//import java.util.Arrays;
//public class FindKim {
//    public String findKim(String[] seoul){
//        //x에 김서방의 위치를 저장하세요.
//        int x = Arrays.asList(seoul).indexOf("Kim");
//        return "김서방은 "+ x + "에 있다";
//    }
