import java.util.*;
import java.util.stream.*;
import java.util.Arrays.*;

//public class Main {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        String[] a = {"mislav", "stanko", "mislav", "ana"};
//        String[] b = {"stanko", "ana", "mislav"};
//        System.out.println(temp.solution(a,b));
//    }
//}
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        HashMap<String, Integer> temp2 = new HashMap();
//
//        for(int i = 0 ; i < participant.length; i++){
//            // 참가자 이름의 키가 존재하는지 확인
//            if(temp2.containsKey(participant[i])){ // 존재
//                int count = temp2.get(participant[i]);  // 해당 이름의 참가자 인원수(value)를 확인
//                temp2.replace(participant[i], count+1); // 해당 이름으로 참가자 인원수 1명 추가
//            }else{ // 존재 x
//                temp2.put(participant[i], 1); // value에 해당 이름의 참가자 인원 수를 뜻하는 value 저장
//            }
//        }
//
//
//        for(String i : completion){
//            int result = temp2.get(i); // 완주자 이름으로 총 참가자 인원 수(value) 확인
//            if(result-1 == 0){ //  참가자 인원 수에서 완주자 1명을 뺐을 때 0명이면
//                temp2.remove(i); // hashmap에서 제거
//            }else{ // 0명이 아니면
//                temp2.replace(i, result-1); // 1명 뺀 인원 수로 다시 저장
//            }
//        }
//
//        // 'completion의 길이는 participant의 길이보다 1 작습니다.' 라는 조건이 있으므로 무조건 한 명만 남기 때문에 인덱스 0으로 미완주자 반환
//        answer = temp2.keySet().toArray()[0].toString() ;
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        int[] a = {3,3,3,2,2,4};
//        System.out.println(temp.solution(a));
//    }
//}
//class Solution {
//    public int solution(int[] nums) {
//        int answer = 0;
//        // int[] -> Integer[] -> Set<Integer>, 반복문 없이 전환
//        Integer[] b = Arrays.stream(nums).boxed().toArray(Integer[]::new);
//        Set set = new HashSet(Arrays.asList(b));
//
//        // 반복문 전환
//        Set<Integer> set2 = new HashSet<Integer>();
//        for(int i : nums){
//            set2.add(i);
//        }
//        if(set.size() >= (nums.length/2)){
//            answer = (nums.length/2);
//        }else{
//            answer = set.size();
//        }
//        return answer;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        String[] a = {"1234", "444", "25"};
//        System.out.println(temp.solution(a));
//    }
//}
//class Solution {
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        HashMap<String, Integer> temp = new HashMap<>();
//        Arrays.sort(phone_book, (String s1, String s2) -> s1.length() - s2.length());
//        for(String i : phone_book){
////            ArrayList<Character> temp2 = new ArrayList<>();
////            for(char j : i.toCharArray()){
////                temp2.add(j);
////                // create object of StringBuilder class
////                StringBuilder sb = new StringBuilder();
////
////                // Appends characters one by one
////                for (char ch : temp2) {
////                    sb.append(ch);
////                }
////
////                if(temp.get(sb.toString()) != null){
////                    return false;
////                }
////            }
//            for(int j = 0; j < i.length(); j++){
//                String temp2 = i.substring(0, j+1);
//                System.out.println(temp2);
//                if(temp.get(temp2) != null && temp.get(temp2) >= 1){
//                    return false;
//                }
//            }
//            temp.put(i,temp.getOrDefault(i,i.length()));
//        }
//
//        return true;
//    }
//}
//class Solution {
//    public int solution(String[][] clothes){
//        int answer = 0;
//        HashMap<String, Integer> hash = new HashMap<String, Integer>();
//        for(String[] i : clothes){
//            hash.put(i[1], hash.getOrDefault(i[1],1)+1);
//        }
//
//        var combi = 1
//        for(int i : hash.values()){
//            combi *= i;
//        }
//
//        answer = combi-1;
//        return answer;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        String[] a = {"mislav", "stanko", "mislav", "ana"};
//        String[] b = {"stanko", "ana", "mislav"};
//        System.out.println(temp.solution(a,b));
//    }
//}

//public class Main{
//    public static Set<Integer> result = new HashSet<Integer>();
//
//    public static void main(String[] args){
//        for(int i = 1; i <= 10000; i++){
//            if(!result.contains(i)){
//                d(String.valueOf(i));
//            }
//            if(!result.contains(i)){
//                System.out.println(i);
//            }
//        }
//    }
//
//    private static int d(String num){
//        int temp = Integer.parseInt(num);
//        if(temp > 10000) return 0;
//        for(char i : num.toCharArray()){
//            temp += (i - '0');
//        }
//        if(result.contains(temp)) return 0;
//        result.add(temp);
//        return d(String.valueOf(temp));
//    }
//}

//
//public class Main {
//    public int[] solution(int[] arr) {
//        int[] answer = {};
//
//        Stack<Integer> result = new Stack<>();
//        for(int i =0; i < arr.length; i++){
//            if(result.size() > 0){
//                if(result.lastElement() != arr[i]){
//                    result.push(arr[i]);
//                }
//            }else{
//                result.push(arr[i]);
//            }
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}
//class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//        int[] answer = {};
//        ArrayList<Integer> left = new ArrayList<>();
//        for(int i =0; i <  progresses.length; i++){
//            int temp = 100-progresses[i];
//            int count = temp / speeds[i];
//            if(temp % speeds[i] > 0) count++;
//            left.add(count);
//        }
//
//        System.out.println(left);
//
//        Stack<Integer> stack = new Stack<>();
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for(int i : left){
//            if(stack.size() > 0){
//                if(stack.firstElement() < i){
//                    result.add(stack.size());
//                    stack.clear();
//                    stack.push(i);
//                }else{
//                    stack.push(i);
//                }
//            }else{
//                stack.push(i);
//            }
//        }
//
//        if(stack.size()>0){
//            result.add(stack.size());
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}

//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//
//        Stack<Character> stack = new Stack<>();
//        for(char i : s.toCharArray()){
//            if(i=='('){
//                stack.push(i);
//            }else{
//                if(stack.size() == 0){
//                    answer = false;
//                    break;
//                }
//                stack.pop();
//            }
//        }
//
//        if(stack.size()>0) answer = false;
//
//        return answer;
//    }
//}

//class Solution {
//    public int solution(int[] priorities, int location) {
//        int answer = 0;
//        ArrayDeque<int[]> q = new ArrayDeque<>();
//
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
//
//        for (int i = 0; i < priorities.length; i++) {
//            q.addLast(new int[]{i, priorities[i]});
//            pq.add(priorities[i]);
//        }
//
//        int target = pq.peek();
//
//        while (pq.size() > 0) {
//            if (q.getFirst()[1] == target) {
//                pq.poll();
//                if(pq.size()>0) {
//                    target = pq.peek();
//                }
//                answer++;
//                if (q.getFirst()[0] == location) break;
//                q.poll();
//            } else {
//                int[] back = q.poll();
//                q.add(back);
//            }
//        }
//
//        return answer;
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer> array = new ArrayList<Integer>();
//
//        for (int i = 0; i < n; i++) {
//            array.add(sc.nextInt());
//        }
//
//        int result = 0;
//        array.sort(Comparator.naturalOrder());
//
//        if (n % 2 == 0) {
//            int ref1 = (int) array.get(array.size() / 2 - 1);
//            int ref2 = (int) array.get(array.size() / 2);
//
//            int sum1 = 0;
//            int sum2 = 0;
//            for (Integer i : array) {
//                sum1 += Math.abs(i - ref1);
//                sum2 += Math.abs(i - ref2);
//            }
//            if(sum1<= sum2) result = ref1;
//            else result = ref2;
//        } else {
//            result = (int) array.get(array.size() / 2);
//        }
//
//        System.out.println(result);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
//    }
//
//    public static int solution(int bridge_length, int weight, int[] truck_weights) {
//        int answer = 0;
//        ArrayDeque<Integer> qq = new ArrayDeque<>();
//        ArrayList<int[]> q = new ArrayList<>();
//
//        for (int i : truck_weights) {
//            qq.add(i);
//        }
//
//        int count = 0;
//        ArrayList<Integer> truck = new ArrayList<>();
//
//        while (truck.size() != truck_weights.length) {
////            System.out.println(count + " "+truck +" "+ q.size()+" "+qq);
//            int sum = 0;
//
//            int idx = -1;
//            for (int i = 0; i < q.size(); i++) {
//                q.get(i)[1]--;
//                if (q.get(i)[1] > 0) {
//                    sum += q.get(i)[0];
//                } else {
//                    truck.add(q.get(i)[0]);
//                    idx = i;
//                }
//            }
//            if (idx > -1) q.remove(idx);
//            if(qq.size() > 0){
//                int next = qq.peek();
//                if (sum + next <= weight && q.size() + 1 <= bridge_length) {
//                    q.add(new int[]{qq.poll(), bridge_length});
//                }
//            }
//            count++;
//        }
//
//
//        return count;
//    }
//}

//class Solution {
//    public int[] solution(int[] prices) {
//        int[] answer = {};
//        ArrayList<Integer> temp = new ArrayList<>();
//        for(int i = 0  ; i < prices.length - 1; i++){
//            int count = 0;
//            for(int j = i+1; j < prices.length; j++){
//                count++;
//                if(prices[i] > prices[j]){
//                    break;
//                }
//            }
//            temp.add(count);
//        }
//        temp.add(0);
//
//        return temp.stream().mapToInt(Integer::intValue).toArray();
//    }
//}

//class Solution {
//    public int[] solution(int N, int[] stages) {
//
//        Map<Integer, Double> map = new HashMap<>();
//        for (int i = 1; i <= N; i++) {
//            double total = 0;
//            double fail = 0;
//            for (int j = 0; j < stages.length; j++) {
//                if (i <= stages[j]) total++;
//                if (i == stages[j]) fail++;
//            }
//            if (total == 0 && fail == 0) total = 1;
//            map.put(i, fail / total);
//        }
//
//        int[] answer = new int[N];
//        for (int i = 0; i < N; i++) {
//            double max = -1;
//            int rKey = 0;
//            for (int key : map.keySet()) {
//                if (max < map.get(key)) {
//                    max = map.get(key);
//                    rKey = key;
//                }
//            }
//            answer[i] = rKey;
//            map.remove(rKey);
//        }
//
//        return answer;
//    }
//}


//class Solution {
//    public int solution(int[] people, int limit) {
//        ArrayList<Integer> result = new ArrayList();
//
//        Deque<Integer> tempp = new ArrayDeque<>();
//        for(int i : Arrays.stream(people).sorted().toArray()){
//            tempp.add(i);
//        }
//
//        while (tempp.size()>0) {
//            result.add(tempp.poll());
//            int idx = result.size()-1;
//            Boolean flag = false;
//            while(tempp.size() > 0){
//                int tempSum = result.get(idx) + tempp.getLast();
//                if (tempSum <= limit) {
//                    result.set(idx, tempSum);
//                    flag = true;
//                }else{
//                    if(flag) break;
//                    result.add(tempp.getLast());
//                }
//                tempp.removeLast();
//            }
//        }
//        return result.size();
//    }
//}


//class Solution {
//    public int solution(int[][] routes) {
//        int answer = 0;
//        ArrayList<int[]> temp = new ArrayList<>();
//
//        int count = 0;
//        Arrays.sort(routes, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
//                //return o2[0]-o1[0]; // 첫번째 숫자 기준 내림차순 {5,40}{4,20}{3,50}{2,10}{1,30}
//                //return o1[1]-o2[1]; // 두번째 숫자 기준 오름차순 {2,10}{4,20}{1,30}{5,40}{3,50}
//                //return o2[1]-o1[1]; // 두번째 숫자 기준 내림차순 {3,50}{5,40}{1,30}{4,20}{2,10}
//            }
//        });
//        for (int[] i :  routes) {
//            System.out.println(i[0]+" "+i[1]);
//            if (temp.size() > 0) {
//                Boolean flag = false;
//                int start = i[0];
//                int end = i[1];
//                if (start > end) {
//                    start = i[1];
//                    end = i[0];
//                }
//
//                for (int[] j : temp) {
//                    if ((start <= j[1] && end >= j[0])) {
//                        flag = true;
//                        break;
//                    }
//                }
//                if (!flag) {
//                    count++;
//                }
//            } else {
//                count++;
//            }
//
//            if (i[0] > i[1]) {
//                temp.add(new int[]{i[1], i[0]});
//            } else {
//                temp.add(i);
//            }
//        }
//
//        return count;
//    }
//}

//class Solution {
//    public int solution(int[][] triangle) {
//        int answer = 0;
//        int[][] result = triangle.clone();
//
//        for (int i = 1; i < triangle.length; i++) {
//            for (int j = 0; j < triangle[i].length; j++) {
//                int num = result[i][j];
//                if (j - 1 > -1) {
//                    int leftUp = triangle[i - 1][j - 1];
//                    result[i][j] = Math.max(leftUp + num, result[i][j]);
//                }
//                if (j < triangle[i].length - 1) {
//                    int rightUp = triangle[i - 1][j];
//                    result[i][j] = Math.max(rightUp + num, result[i][j]);
//                }
//            }
//        }
//
//        for (int i : triangle[triangle.length - 1]) {
//            answer = Math.max(i, answer);
//        }
//        return answer;
//    }
//}


//class Solution {
//    public int[] solution(int[] answers) {
//        int[] answer = {0, 0, 0};
//
//        for (int i = 0; i < answers.length; i++) {
//            int idx = i % 5 + 1;
//            // 첫 번째
//            if (answers[i] == idx) {
//                answer[0]++;
//            }
//
//            // 두 번째
//            if (i % 2 == 0 && answers[i] == 2) {
//                answer[1]++;
//            } else {
//                int idx2 = i % 8;
//                if (idx2 == 1 && answers[i] == 1) answer[1]++;
//                else if (idx2 == 3 && answers[i] == 3) answer[1]++;
//                else if (idx2 == 5 && answers[i] == 4) answer[1]++;
//                else if (idx2 == 7 && answers[i] == 5) answer[1]++;
//            }
//
//            // 세 번째
//            int idx3 = i % 10;
//            if (idx3 > -1 && idx3 < 2 && answers[i] == 3) answer[2]++;
//            else if (idx3 > 1 && idx3 < 4 && answers[i] == 1) answer[2]++;
//            else if (idx3 > 3 && idx3 < 6 && answers[i] == 2) answer[2]++;
//            else if (idx3 > 5 && idx3 < 8 && answers[i] == 4) answer[2]++;
//            else if (idx3 > 7 && idx3 < 10 && answers[i] == 5) answer[2]++;
//        }
//
//        int max = Arrays.stream(answer).max().getAsInt();
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i : answer) {
//            if (i == max) {
//                result.add(i + 1);
//            }
//        }
//
//        return result.stream()
//                .mapToInt(i -> i)
//                .toArray();
//    }
//}
//

class Main {
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.solution(new String[]{"5", "-", "3", "+", "1", "+", "2", "-", "4"}));
    }
}

class Solution {
    static HashMap<String[], String> hash = new HashMap<>();

    public static String sum(String[] arr) {
        Integer left = Integer.valueOf(arr[0]);
        Integer right = Integer.valueOf(arr[2]);
        if (arr[1].equals("+")) {
            return String.valueOf(left + right);
        } else {
            return String.valueOf(left - right);
        }
    }

    public static String cal(String[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 3) {
            String last = sum(new String[]{arr[0], arr[1], arr[2]});
            return last;
        } else {
            int maxNum = -10000000;
            for (int i = 0; i < arr.length - 2; i += 2) {

                ArrayList<String> nextEquation = new ArrayList<>();

                if (i > 0) {
                    String[] leftString = Arrays.copyOfRange(arr, 0, i - 1);
                    if(leftString.length == 1){
                        nextEquation.add(leftString[0]);
                    }else{
                        if (hash.containsKey(leftString)) {
                            nextEquation.add(hash.get(leftString));
                        } else {
                            String leftResult = cal(leftString);
                            hash.put(leftString, leftResult);
                            nextEquation.addAll(Arrays.asList(leftString));
                        }
                    }
                    nextEquation.add(arr[i - 1]);
                }

                String[] middleString = new String[]{arr[i], arr[i + 1], arr[i + 2]};
                String middleResult = cal(middleString);
                hash.put(middleString, middleResult);
                nextEquation.add(middleResult);

                if (arr.length > i + 3) {
                    nextEquation.add(arr[i + 3]);
                    String[] rightString = Arrays.copyOfRange(arr, i + 4, arr.length);
                    if(rightString.length == 1){
                        nextEquation.add(rightString[0]);
                    }else{
                        if (hash.containsKey(rightString)) {
                            nextEquation.add(hash.get(rightString));
                        } else {
                            String rightResult = cal(rightString);
                            hash.put(rightString, rightResult);
                            nextEquation.addAll(Arrays.asList(rightString));
                        }
                    }
                }

                String Realresult = cal(nextEquation.toArray(new String[]{}));
                hash.put(nextEquation.toArray(new String[]{}), Realresult);

                maxNum = Math.max(maxNum, Integer.parseInt(Realresult));
            }
            return String.valueOf(maxNum);
        }
    }

    public int solution(String arr[]) {
        int answer = -1;

        if (arr.length > 1) {
            answer = Integer.parseInt(cal(arr));
        } else {
            return Integer.parseInt(arr[0]);
        }

        for (String[] i : hash.keySet()) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.print(" " + hash.get(i));
            System.out.println("");
        }

        return answer;
    }
}


















