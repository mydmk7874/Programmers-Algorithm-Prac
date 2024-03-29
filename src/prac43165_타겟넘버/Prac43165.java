package prac43165_타겟넘버;


//타겟 넘버
//n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다.
// 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
//사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때
// 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
public class Prac43165 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        System.out.println(s.solution(numbers, target));
    }
}

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        for (int i = 0; i < (Math.pow(2, numbers.length)); i++) {
            String binary = Integer.toBinaryString(i);
            String[] binaryArray = binary.split("");
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                if((numbers.length-j)>binaryArray.length) {
                    sum -= numbers[j];
                } else {
                    if(binaryArray[j+binaryArray.length-numbers.length].equals("1")) {
                        sum += numbers[j];
                    } else sum -= numbers[j];
                }
            }

            if(sum == target) answer++;
        }
        return answer;
    }

}

//너무 원시적으로 푼거같다.
//다른답안
//class Solution {
//    public int solution(int[] numbers, int target) {
//        int answer = 0;
//        answer = dfs(numbers, 0, 0, target);
//        return answer;
//    }
//    int dfs(int[] numbers, int n, int sum, int target) {
//        if(n == numbers.length) {
//            if(sum == target) {
//                return 1;
//            }
//            return 0;
//        }
//        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
//    }
//}
