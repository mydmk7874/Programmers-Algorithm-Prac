package prac12935;

import java.util.*;

public class Prac12935 {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr = {4,3,2,1,6,335,432};
        System.out.println(Arrays.toString(s.solution(arr)));

    }
}


class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int min = arr[0];

        for(int i=0;i < arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length-1];

        for(int i=0;i < arr.length; i++) {
            if(arr[i] == min) {
                for(int j=i+1; j < arr.length; j++) {
                    answer[j-1] = arr[j];
                }
                break;
            }
            answer[i] = arr[i];
        }
        return answer;

    }
}

//김주희님 답안
//class Solution {
//    public int[] solution(int[] arr) {
//        int[] answer = new int[arr.length == 1 ? 1 : arr.length - 1];   //최종적으로 정답을 담을 배열인 answer의 길이는 삼항연산자를 사용해서
//        boolean isEmpty = true;                                         //arr배열의 길이가 1인 경우에는 길이를 1로, 그 외에 경우에는 arr의 길이보다 하나 작은 길이로 설정하게끔 해준다.
//        //isEmpty는 가장 작은 수를 제거했을 때 최종적으로 배열이 빈 배열인지 아닌지 판별하기 위해 선언해주었다.
//        //아직 answer에는 값을 넣기 전이니 true로 설정해주고,
//        //만약 answer에 하나라도 값이 들어오는 순간 false로 바꿔줄 것이다.
//        int temp = arr[0];      //가장 작은 수를 구해서 temp에 넣어줄 예정인데, 우선은 temp를 arr의 가장 첫번째 값으로 초기화 해준다.
//
//        for(int i : arr) {  //arr배열을 탐색하며 temp보다 작은 값이 있으면 그 값을 temp에 다시 넣어준다.
//            if(temp > i) {  //이렇게 되면 temp에 마지막으로 들어오는 값이 가장 작은 값이 된다.
//                temp = i;
//            }
//        }
//        int index = 0;  //answer의 인덱스 값으로 사용할 index 변수를 0으로 초기화 해준다.
//        for(int i : arr) {  //다시 arr배열을 돌면서, 하나씩 값을 확인해줄 것인데,
//            if(temp != i) { //i가 temp가 아니면, 즉, 최소값이 아니면 answer 변수에 차례로 담아준다.
//                answer[index] = i;  //값을 넣어줄때마다 index를 증가시켜주고, 위에서 말한 대로
//                index++;            //if문이 발생했다는 것은 값을 하나라도 넣어주겠다는 뜻으로,
//                isEmpty = false;    //isEmpty는 false값으로 바꾸어준다.
//            }
//        }
//        if(isEmpty) {           //만약 isEmpty가 여전히 true라면 위에 반복문 안 if문 조건에 해당되지 않는다는 것이므로,
//            answer[0] = -1;     //answer은 비어있다는 뜻이다. 이 비어있는 answer 배열에
//        }                       //첫번째 값으로 -1을 넣어주면 배열이 비어있는 경우에 answer 배열에는 -1만 담기게 된다.
//
//        return answer;
//    }
//}
