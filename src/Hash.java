
import java.util.HashMap;

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
