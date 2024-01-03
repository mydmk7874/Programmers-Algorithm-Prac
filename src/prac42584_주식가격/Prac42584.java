package prac42584_주식가격;

import java.util.*;

//주식가격
//초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
// 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

public class Prac42584 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = {5,4,3,2,1};
        System.out.println(Arrays.toString(s.solution(prices)));
    }
}

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();

        int time = 0;

        for (int price : prices) {
            queue.offer(new Node(price, time));
            time++;
        }

        while (true) {
            Node temp = queue.poll();

            if(queue.isEmpty()) {
                answer[temp.time] = 0;
                while (!stack.isEmpty()) {
                    temp = stack.pop();
                    answer[temp.time] = time - temp.time-1;
                }
                break;
            }

            if(stack.isEmpty()) {
                stack.push(temp);
                continue;
            }

            while (true) {
                if (stack.isEmpty() || temp.price >= stack.peek().price) {
                    stack.push(temp);
                    break;
                } else {
                    Node temp2 = stack.pop();
                    answer[temp2.time] = temp.time - temp2.time;
                }
            }
        }

        return answer;
    }
}

class Node {
    public int price;
    public int time;

    public Node(int price, int time) {
        this.price = price;
        this.time = time;
    }
}

//시간초과 뜬 답안
//int[] answer = new int[prices.length];
//
//        Queue<Integer> priceQueue = new LinkedList<>();
//        for (int price: prices) {
//            priceQueue.offer(price);
//        }
//
//
//        for (int i = 0; i < prices.length-1; i++) {
//            int period = 0;
//
//            priceQueue.poll();
//
//            if(priceQueue.isEmpty()) {
//                answer[i] = period;
//                break;
//            }
//
//            Queue<Integer> temp = new LinkedList<>(priceQueue);
//
//            while(!temp.isEmpty()) {
//                period++;
//                if(prices[i] > temp.poll()) {
//                    break;
//                }
//            }
//
//            answer[i] = period;
//        }
//
//        return answer;


//    Stack<Integer[]> stack = new Stack<>();
//        int[] ret = new int[prices.length];
//
//        for (int i = prices.length - 2; i >= 0; i--) {
//            int day = 0;
//
//            while (!stack.isEmpty() && stack.peek()[0] >= prices[i]) {
//                day += stack.pop()[1];
//            }
//
//            ret[i] = stack.push(new Integer[]{prices[i], day + 1})[1];
//        }
//
//        return ret;