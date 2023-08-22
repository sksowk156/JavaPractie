import java.util.*;

//public class CodingTest {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] answer = s.solution(2, 9);
//        for (int i = 0; i < 2; i++) {
//            System.out.println(s.solution(2, 9)[i]);
//        }
//    }
//}
//
//class Solution {
//    public int[] solution(int n, int s) {
//        int[] answer = new int[n];
//        for (int i = 0; i < n; i++) {
//            int num = s / (n - i);
//            if (num == 0) {
//                return new int[]{-1};
//            }
//            s -= num;
//            answer[i] = num;
//        }
//        return answer;
//    }
//}
//class Solution {
//    public long solution(int n, int[] works) {
//        if (Arrays.stream(works).sum() < n) return 0;
//
//        long answer = 0;
//
//        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
//        for (int i : works) {
//            q.add(i);
//        }
//
//        for (int i = 0; i < n; i++) {
//            int max = (int) q.poll();
//            max -= 1;
//            if (max > 0) q.add(max);
//        }
//
//        for (int i : q) {
//            answer += Math.pow(i, 2);
//        }
//        return answer;
//    }
//}

