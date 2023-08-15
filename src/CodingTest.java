import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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
