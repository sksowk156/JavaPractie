package codingtest;

import java.util.HashMap;
import java.util.HashSet;

//public class Hash {
//    public static void main(String[] args) {
//
//    }
//}
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> hash = new HashMap<>();
//        for (String i : participant) {
//            int nameCount = hash.getOrDefault(i, 0);
//            hash.put(i, nameCount + 1);
//        }
//        for (String i : completion) {
//            int nameCount = hash.get(i);
//            if (nameCount > 1) {
//                hash.put(i, nameCount - 1);
//            } else {
//                hash.remove(i);
//            }
//        }
//
//        answer = (String) hash.keySet().toArray()[0];
//        return answer;
//    }
//}

//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> temp2 = new HashMap();
//        for(int i = 0 ; i < participant.length; i++){
//            if(temp2.containsKey(participant[i])){
//                int count = temp2.get(participant[i]);
//                temp2.replace(participant[i], count+1);
//            }else{
//                temp2.put(participant[i], 1);
//            }
//        }
//
//
//        for(String i : completion){
//            int result = temp2.get(i);
//            if(result-1 == 0){
//                temp2.remove(i);
//            }else{
//                temp2.replace(i, result-1);
//            }
//        }
//
//        answer = temp2.keySet().toArray()[0].toString() ;
//        return answer;
//    }
//}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int limit = nums.length / 2;
        int result = set.size();

        if (limit > result) {
            answer = result;
        } else {
            answer = limit;
        }

        return answer;
    }
}

//class Solution {
//    public int solution(int[] nums) {
//        int answer = 0;
//        Set<Integer> set = new HashSet<Integer>();
//        for(int i : nums){
//            set.add(i);
//        }
//        if(set.size() >= (nums.length/2)){
//            answer = (nums.length/2);
//        }else{
//            answer = set.size();
//        }
//        return answer;
//    }
//}