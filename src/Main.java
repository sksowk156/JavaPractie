//import java.util.*;
//import java.util.stream.*;
//import java.util.Arrays.*;
//
////public class Main {
////    public static void main(String[] args) {
////        Solution temp = new Solution();
////        String[] a = {"mislav", "stanko", "mislav", "ana"};
////        String[] b = {"stanko", "ana", "mislav"};
////        System.out.println(temp.solution(a,b));
////    }
////}
////
////class Solution {
////    public String solution(String[] participant, String[] completion) {
////        String answer = "";
////        HashMap<String, Integer> temp2 = new HashMap();
////
////        for(int i = 0 ; i < participant.length; i++){
////            // 참가자 이름의 키가 존재하는지 확인
////            if(temp2.containsKey(participant[i])){ // 존재
////                int count = temp2.get(participant[i]);  // 해당 이름의 참가자 인원수(value)를 확인
////                temp2.replace(participant[i], count+1); // 해당 이름으로 참가자 인원수 1명 추가
////            }else{ // 존재 x
////                temp2.put(participant[i], 1); // value에 해당 이름의 참가자 인원 수를 뜻하는 value 저장
////            }
////        }
////
////
////        for(String i : completion){
////            int result = temp2.get(i); // 완주자 이름으로 총 참가자 인원 수(value) 확인
////            if(result-1 == 0){ //  참가자 인원 수에서 완주자 1명을 뺐을 때 0명이면
////                temp2.remove(i); // hashmap에서 제거
////            }else{ // 0명이 아니면
////                temp2.replace(i, result-1); // 1명 뺀 인원 수로 다시 저장
////            }
////        }
////
////        // 'completion의 길이는 participant의 길이보다 1 작습니다.' 라는 조건이 있으므로 무조건 한 명만 남기 때문에 인덱스 0으로 미완주자 반환
////        answer = temp2.keySet().toArray()[0].toString() ;
////        return answer;
////    }
////}
////public class Main {
////    public static void main(String[] args) {
////        Solution temp = new Solution();
////        int[] a = {3,3,3,2,2,4};
////        System.out.println(temp.solution(a));
////    }
////}
////class Solution {
////    public int solution(int[] nums) {
////        int answer = 0;
////        // int[] -> Integer[] -> Set<Integer>, 반복문 없이 전환
////        Integer[] b = Arrays.stream(nums).boxed().toArray(Integer[]::new);
////        Set set = new HashSet(Arrays.asList(b));
////
////        // 반복문 전환
////        Set<Integer> set2 = new HashSet<Integer>();
////        for(int i : nums){
////            set2.add(i);
////        }
////        if(set.size() >= (nums.length/2)){
////            answer = (nums.length/2);
////        }else{
////            answer = set.size();
////        }
////        return answer;
////    }
////}
//
////public class Main {
////    public static void main(String[] args) {
////        Solution temp = new Solution();
////        String[] a = {"1234", "444", "25"};
////        System.out.println(temp.solution(a));
////    }
////}
////class Solution {
////    public boolean solution(String[] phone_book) {
////        boolean answer = true;
////        HashMap<String, Integer> temp = new HashMap<>();
////        Arrays.sort(phone_book, (String s1, String s2) -> s1.length() - s2.length());
////        for(String i : phone_book){
//////            ArrayList<Character> temp2 = new ArrayList<>();
//////            for(char j : i.toCharArray()){
//////                temp2.add(j);
//////                // create object of StringBuilder class
//////                StringBuilder sb = new StringBuilder();
//////
//////                // Appends characters one by one
//////                for (char ch : temp2) {
//////                    sb.append(ch);
//////                }
//////
//////                if(temp.get(sb.toString()) != null){
//////                    return false;
//////                }
//////            }
////            for(int j = 0; j < i.length(); j++){
////                String temp2 = i.substring(0, j+1);
////                System.out.println(temp2);
////                if(temp.get(temp2) != null && temp.get(temp2) >= 1){
////                    return false;
////                }
////            }
////            temp.put(i,temp.getOrDefault(i,i.length()));
////        }
////
////        return true;
////    }
////}
////class Solution {
////    public int solution(String[][] clothes){
////        int answer = 0;
////        HashMap<String, Integer> hash = new HashMap<String, Integer>();
////        for(String[] i : clothes){
////            hash.put(i[1], hash.getOrDefault(i[1],1)+1);
////        }
////
////        var combi = 1
////        for(int i : hash.values()){
////            combi *= i;
////        }
////
////        answer = combi-1;
////        return answer;
////    }
////}
//
////public class Main {
////    public static void main(String[] args) {
////        Solution temp = new Solution();
////        String[] a = {"mislav", "stanko", "mislav", "ana"};
////        String[] b = {"stanko", "ana", "mislav"};
////        System.out.println(temp.solution(a,b));
////    }
////}
//
////public class Main{
////    public static Set<Integer> result = new HashSet<Integer>();
////
////    public static void main(String[] args){
////        for(int i = 1; i <= 10000; i++){
////            if(!result.contains(i)){
////                d(String.valueOf(i));
////            }
////            if(!result.contains(i)){
////                System.out.println(i);
////            }
////        }
////    }
////
////    private static int d(String num){
////        int temp = Integer.parseInt(num);
////        if(temp > 10000) return 0;
////        for(char i : num.toCharArray()){
////            temp += (i - '0');
////        }
////        if(result.contains(temp)) return 0;
////        result.add(temp);
////        return d(String.valueOf(temp));
////    }
////}
//
////
////public class Main {
////    public int[] solution(int[] arr) {
////        int[] answer = {};
////
////        Stack<Integer> result = new Stack<>();
////        for(int i =0; i < arr.length; i++){
////            if(result.size() > 0){
////                if(result.lastElement() != arr[i]){
////                    result.push(arr[i]);
////                }
////            }else{
////                result.push(arr[i]);
////            }
////        }
////
////        return result.stream().mapToInt(Integer::intValue).toArray();
////    }
////}
////class Solution {
////    public int[] solution(int[] progresses, int[] speeds) {
////        int[] answer = {};
////        ArrayList<Integer> left = new ArrayList<>();
////        for(int i =0; i <  progresses.length; i++){
////            int temp = 100-progresses[i];
////            int count = temp / speeds[i];
////            if(temp % speeds[i] > 0) count++;
////            left.add(count);
////        }
////
////        System.out.println(left);
////
////        Stack<Integer> stack = new Stack<>();
////        ArrayList<Integer> result = new ArrayList<>();
////
////        for(int i : left){
////            if(stack.size() > 0){
////                if(stack.firstElement() < i){
////                    result.add(stack.size());
////                    stack.clear();
////                    stack.push(i);
////                }else{
////                    stack.push(i);
////                }
////            }else{
////                stack.push(i);
////            }
////        }
////
////        if(stack.size()>0){
////            result.add(stack.size());
////        }
////
////        return result.stream().mapToInt(Integer::intValue).toArray();
////    }
////}
//
////class Solution {
////    boolean solution(String s) {
////        boolean answer = true;
////
////        Stack<Character> stack = new Stack<>();
////        for(char i : s.toCharArray()){
////            if(i=='('){
////                stack.push(i);
////            }else{
////                if(stack.size() == 0){
////                    answer = false;
////                    break;
////                }
////                stack.pop();
////            }
////        }
////
////        if(stack.size()>0) answer = false;
////
////        return answer;
////    }
////}
//
////class Solution {
////    public int solution(int[] priorities, int location) {
////        int answer = 0;
////        ArrayDeque<int[]> q = new ArrayDeque<>();
////
////        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
////
////        for (int i = 0; i < priorities.length; i++) {
////            q.addLast(new int[]{i, priorities[i]});
////            pq.add(priorities[i]);
////        }
////
////        int target = pq.peek();
////
////        while (pq.size() > 0) {
////            if (q.getFirst()[1] == target) {
////                pq.poll();
////                if(pq.size()>0) {
////                    target = pq.peek();
////                }
////                answer++;
////                if (q.getFirst()[0] == location) break;
////                q.poll();
////            } else {
////                int[] back = q.poll();
////                q.add(back);
////            }
////        }
////
////        return answer;
////    }
////}
//
////public class Main {
////    public static void main(String[] args) throws IOException {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        ArrayList<Integer> array = new ArrayList<Integer>();
////
////        for (int i = 0; i < n; i++) {
////            array.add(sc.nextInt());
////        }
////
////        int result = 0;
////        array.sort(Comparator.naturalOrder());
////
////        if (n % 2 == 0) {
////            int ref1 = (int) array.get(array.size() / 2 - 1);
////            int ref2 = (int) array.get(array.size() / 2);
////
////            int sum1 = 0;
////            int sum2 = 0;
////            for (Integer i : array) {
////                sum1 += Math.abs(i - ref1);
////                sum2 += Math.abs(i - ref2);
////            }
////            if(sum1<= sum2) result = ref1;
////            else result = ref2;
////        } else {
////            result = (int) array.get(array.size() / 2);
////        }
////
////        System.out.println(result);
////    }
////}
////
////class Main {
////    public static void main(String[] args) {
////        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
////    }
////
////    public static int solution(int bridge_length, int weight, int[] truck_weights) {
////        int answer = 0;
////        ArrayDeque<Integer> qq = new ArrayDeque<>();
////        ArrayList<int[]> q = new ArrayList<>();
////
////        for (int i : truck_weights) {
////            qq.add(i);
////        }
////
////        int count = 0;
////        ArrayList<Integer> truck = new ArrayList<>();
////
////        while (truck.size() != truck_weights.length) {
//////            System.out.println(count + " "+truck +" "+ q.size()+" "+qq);
////            int sum = 0;
////
////            int idx = -1;
////            for (int i = 0; i < q.size(); i++) {
////                q.get(i)[1]--;
////                if (q.get(i)[1] > 0) {
////                    sum += q.get(i)[0];
////                } else {
////                    truck.add(q.get(i)[0]);
////                    idx = i;
////                }
////            }
////            if (idx > -1) q.remove(idx);
////            if(qq.size() > 0){
////                int next = qq.peek();
////                if (sum + next <= weight && q.size() + 1 <= bridge_length) {
////                    q.add(new int[]{qq.poll(), bridge_length});
////                }
////            }
////            count++;
////        }
////
////
////        return count;
////    }
////}
//
////class Solution {
////    public int[] solution(int[] prices) {
////        int[] answer = {};
////        ArrayList<Integer> temp = new ArrayList<>();
////        for(int i = 0  ; i < prices.length - 1; i++){
////            int count = 0;
////            for(int j = i+1; j < prices.length; j++){
////                count++;
////                if(prices[i] > prices[j]){
////                    break;
////                }
////            }
////            temp.add(count);
////        }
////        temp.add(0);
////
////        return temp.stream().mapToInt(Integer::intValue).toArray();
////    }
////}
//
////class Solution {
////    public int[] solution(int N, int[] stages) {
////
////        Map<Integer, Double> map = new HashMap<>();
////        for (int i = 1; i <= N; i++) {
////            double total = 0;
////            double fail = 0;
////            for (int j = 0; j < stages.length; j++) {
////                if (i <= stages[j]) total++;
////                if (i == stages[j]) fail++;
////            }
////            if (total == 0 && fail == 0) total = 1;
////            map.put(i, fail / total);
////        }
////
////        int[] answer = new int[N];
////        for (int i = 0; i < N; i++) {
////            double max = -1;
////            int rKey = 0;
////            for (int key : map.keySet()) {
////                if (max < map.get(key)) {
////                    max = map.get(key);
////                    rKey = key;
////                }
////            }
////            answer[i] = rKey;
////            map.remove(rKey);
////        }
////
////        return answer;
////    }
////}
//
//
////class Solution {
////    public int solution(int[] people, int limit) {
////        ArrayList<Integer> result = new ArrayList();
////
////        Deque<Integer> tempp = new ArrayDeque<>();
////        for(int i : Arrays.stream(people).sorted().toArray()){
////            tempp.add(i);
////        }
////
////        while (tempp.size()>0) {
////            result.add(tempp.poll());
////            int idx = result.size()-1;
////            Boolean flag = false;
////            while(tempp.size() > 0){
////                int tempSum = result.get(idx) + tempp.getLast();
////                if (tempSum <= limit) {
////                    result.set(idx, tempSum);
////                    flag = true;
////                }else{
////                    if(flag) break;
////                    result.add(tempp.getLast());
////                }
////                tempp.removeLast();
////            }
////        }
////        return result.size();
////    }
////}
//
//
////class Solution {
////    public int solution(int[][] routes) {
////        int answer = 0;
////        ArrayList<int[]> temp = new ArrayList<>();
////
////        int count = 0;
////        Arrays.sort(routes, new Comparator<int[]>() {
////            @Override
////            public int compare(int[] o1, int[] o2) {
////                return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
////                //return o2[0]-o1[0]; // 첫번째 숫자 기준 내림차순 {5,40}{4,20}{3,50}{2,10}{1,30}
////                //return o1[1]-o2[1]; // 두번째 숫자 기준 오름차순 {2,10}{4,20}{1,30}{5,40}{3,50}
////                //return o2[1]-o1[1]; // 두번째 숫자 기준 내림차순 {3,50}{5,40}{1,30}{4,20}{2,10}
////            }
////        });
////        for (int[] i :  routes) {
////            System.out.println(i[0]+" "+i[1]);
////            if (temp.size() > 0) {
////                Boolean flag = false;
////                int start = i[0];
////                int end = i[1];
////                if (start > end) {
////                    start = i[1];
////                    end = i[0];
////                }
////
////                for (int[] j : temp) {
////                    if ((start <= j[1] && end >= j[0])) {
////                        flag = true;
////                        break;
////                    }
////                }
////                if (!flag) {
////                    count++;
////                }
////            } else {
////                count++;
////            }
////
////            if (i[0] > i[1]) {
////                temp.add(new int[]{i[1], i[0]});
////            } else {
////                temp.add(i);
////            }
////        }
////
////        return count;
////    }
////}
//
////class Solution {
////    public int solution(int[][] triangle) {
////        int answer = 0;
////        int[][] result = triangle.clone();
////
////        for (int i = 1; i < triangle.length; i++) {
////            for (int j = 0; j < triangle[i].length; j++) {
////                int num = result[i][j];
////                if (j - 1 > -1) {
////                    int leftUp = triangle[i - 1][j - 1];
////                    result[i][j] = Math.max(leftUp + num, result[i][j]);
////                }
////                if (j < triangle[i].length - 1) {
////                    int rightUp = triangle[i - 1][j];
////                    result[i][j] = Math.max(rightUp + num, result[i][j]);
////                }
////            }
////        }
////
////        for (int i : triangle[triangle.length - 1]) {
////            answer = Math.max(i, answer);
////        }
////        return answer;
////    }
////}
//
//
////class Solution {
////    public int[] solution(int[] answers) {
////        int[] answer = {0, 0, 0};
////
////        for (int i = 0; i < answers.length; i++) {
////            int idx = i % 5 + 1;
////            // 첫 번째
////            if (answers[i] == idx) {
////                answer[0]++;
////            }
////
////            // 두 번째
////            if (i % 2 == 0 && answers[i] == 2) {
////                answer[1]++;
////            } else {
////                int idx2 = i % 8;
////                if (idx2 == 1 && answers[i] == 1) answer[1]++;
////                else if (idx2 == 3 && answers[i] == 3) answer[1]++;
////                else if (idx2 == 5 && answers[i] == 4) answer[1]++;
////                else if (idx2 == 7 && answers[i] == 5) answer[1]++;
////            }
////
////            // 세 번째
////            int idx3 = i % 10;
////            if (idx3 > -1 && idx3 < 2 && answers[i] == 3) answer[2]++;
////            else if (idx3 > 1 && idx3 < 4 && answers[i] == 1) answer[2]++;
////            else if (idx3 > 3 && idx3 < 6 && answers[i] == 2) answer[2]++;
////            else if (idx3 > 5 && idx3 < 8 && answers[i] == 4) answer[2]++;
////            else if (idx3 > 7 && idx3 < 10 && answers[i] == 5) answer[2]++;
////        }
////
////        int max = Arrays.stream(answer).max().getAsInt();
////        ArrayList<Integer> result = new ArrayList<>();
////        for (int i : answer) {
////            if (i == max) {
////                result.add(i + 1);
////            }
////        }
////
////        return result.stream()
////                .mapToInt(i -> i)
////                .toArray();
////    }
////}
////
//
//class Main {
//    public static void main(String[] args) {
//        Solution a = new Solution();
//        System.out.println(a.solution(new String[]{"5", "-", "3", "+", "1", "+", "2", "-", "4"}));
//    }
//}
//
//class Solution {
//    static HashMap<String[], String> hash = new HashMap<>();
//
//    public static String sum(String[] arr) {
//        Integer left = Integer.valueOf(arr[0]);
//        Integer right = Integer.valueOf(arr[2]);
//        if (arr[1].equals("+")) {
//            return String.valueOf(left + right);
//        } else {
//            return String.valueOf(left - right);
//        }
//    }
//
//    public static String cal(String[] arr) {
//        if (arr.length == 1) {
//            return arr[0];
//        } else if (arr.length == 3) {
//            String last = sum(new String[]{arr[0], arr[1], arr[2]});
//            return last;
//        } else {
//            int maxNum = -10000000;
//            for (int i = 0; i < arr.length - 2; i += 2) {
//
//                ArrayList<String> nextEquation = new ArrayList<>();
//
//                if (i > 0) {
//                    String[] leftString = Arrays.copyOfRange(arr, 0, i - 1);
//                    if(leftString.length == 1){
//                        nextEquation.add(leftString[0]);
//                    }else{
//                        if (hash.containsKey(leftString)) {
//                            nextEquation.add(hash.get(leftString));
//                        } else {
//                            String leftResult = cal(leftString);
//                            hash.put(leftString, leftResult);
//                            nextEquation.addAll(Arrays.asList(leftString));
//                        }
//                    }
//                    nextEquation.add(arr[i - 1]);
//                }
//
//                String[] middleString = new String[]{arr[i], arr[i + 1], arr[i + 2]};
//                String middleResult = cal(middleString);
//                hash.put(middleString, middleResult);
//                nextEquation.add(middleResult);
//
//                if (arr.length > i + 3) {
//                    nextEquation.add(arr[i + 3]);
//                    String[] rightString = Arrays.copyOfRange(arr, i + 4, arr.length);
//                    if(rightString.length == 1){
//                        nextEquation.add(rightString[0]);
//                    }else{
//                        if (hash.containsKey(rightString)) {
//                            nextEquation.add(hash.get(rightString));
//                        } else {
//                            String rightResult = cal(rightString);
//                            hash.put(rightString, rightResult);
//                            nextEquation.addAll(Arrays.asList(rightString));
//                        }
//                    }
//                }
//
//                String Realresult = cal(nextEquation.toArray(new String[]{}));
//                hash.put(nextEquation.toArray(new String[]{}), Realresult);
//
//                maxNum = Math.max(maxNum, Integer.parseInt(Realresult));
//            }
//            return String.valueOf(maxNum);
//        }
//    }
//
//    public int solution(String arr[]) {
//        int answer = -1;
//
//        if (arr.length > 1) {
//            answer = Integer.parseInt(cal(arr));
//        } else {
//            return Integer.parseInt(arr[0]);
//        }
//
//        for (String[] i : hash.keySet()) {
//            for (String j : i) {
//                System.out.print(j);
//            }
//            System.out.print(" " + hash.get(i));
//            System.out.println("");
//        }
//
//        return answer;
//    }
//}
//

//class Solution {
//    public int solution(String numbers) {
//        int answer = 0;
//
//        for(int i = 0 ; i < numbers.length(); i++){
//            for(int j = 0 ; j < numbers.length();j++){
//                if(i==j){
//
//                }
//            }
//        }
//
//        return answer;
//    }
//}

//import java.util.HashMap;
//
//class Solution {
//    public int solution(int m, int n, int[][] puddles) {
//        int answer = 0;
//        int[][] map = new int[m][n];
//
//        for (int i = 0; i < puddles.length; i++) {
//            map[puddles[i][0] - 1][puddles[i][1] - 1] = -1;
//        }
//
//        map[0][0] = 1;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((map[i][j] == -1) || (i == 0 && j == 0)) continue;
//
//                int up = i - 1;
//                int left = j - 1;
//
//                if (up > -1 && map[up][j] != -1) map[i][j] += map[up][j];
//
//                if (left > -1 && map[i][left] != -1) map[i][j] += map[i][left];
//
//                map[i][j] %= 1000000007;
//            }
//        }
//
//        answer = map[m - 1][n - 1];
//
//        return answer;
//    }
//}

//import java.util.LinkedList;
//import java.util.Queue;
//
//class Solution {
//
//    public void findCase(int count, LinkedList<Integer> num, int start, int[] numbers, int target){
//        if(count == numbers.length){
//
//        }else{
//            num.addLast(numbers[start]);
//            findCase(count+1, num, start+1, numbers, target);
//            num.remove
//            findCase(count+1, num, start+1, numbers, target);
//        }
//    }
//    public int solution(int[] numbers, int target) {
//        int answer = 0;
//        Queue num = new Stack<Integer>();
//
//        return answer;
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        Solution tepm = new Solution();
//        System.out.println(tepm.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
//    }
//}

//class Solution {
//
//    public int solution(int n, int[][] computers) {
//        int answer = 0;
//        int[] visited = new int[n];
//        ArrayList<Integer> map = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            visited[i] = 0;
//        }
//
//        for (int i = 0; i < computers.length; i++) {
//            if (visited[i] == 0) {
//                visited[i] = 1;
//                answer++;
//                Stack temp = new Stack<Integer>();
//                temp.add(i);
//                while (temp.size() > 0) {
//                    int cycle = (int) temp.pop();
//                    for (int j = 0; j < computers[cycle].length; j++) {
//                        if (cycle != j && visited[j] == 0 && computers[cycle][j] == 1) {
//                            visited[j] = 1;
//                            temp.add(j);
//                        }
//                    }
//                }
//            }
//        }
//
//        return answer;
//    }
//}

//class Main{
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        System.out.println(temp.solution());
//    }
//}

//class Solution {
//    public int solution(int[][] maps) {
//        int answer = 0;
//        int Xsize = maps.length;
//        int Ysize = maps[0].length;
//
//        int[] dx = new int[]{1, -1, 0, 0};
//        int[] dy = new int[]{0, 0, 1, -1};
//        int[][] visited = new int[Xsize][Ysize];
//
//        int count = 1;
//        visited[0][0] = count;
//        Queue<int[]> stack = new LinkedList<>();
//        stack.add(new int[]{0, 0});
//        while (!stack.isEmpty()) {
//            int[] temp = stack.poll();
//            int tempCount = visited[temp[0]][temp[1]];
//            for (int i = 0; i < 4; i++) {
//                int[] nextLocation = new int[]{temp[0] + dx[i], temp[1] + dy[i]};
//                if (nextLocation[0] > -1 && nextLocation[0] < Xsize
//                        && nextLocation[1] > -1 && nextLocation[1] < Ysize
//                        && visited[nextLocation[0]][nextLocation[1]] == 0
//                        && maps[nextLocation[0]][nextLocation[1]] == 1) {
//                    stack.add(nextLocation);
//                    visited[nextLocation[0]][nextLocation[1]] = tempCount + 1;
//                }
//            }
//        }
//
//        answer = visited[Xsize - 1][Ysize - 1];
//        if (answer == 0) answer = -1;
//        return answer;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // Scanner 클래스의 인스턴스 생성하기
//        Scanner scanner = new Scanner(System.in);
//        // nextLine() 메서드를 통해 입력 값 변수에 저장하기
//        int n = scanner.nextInt();
//        PriorityQueue q = new PriorityQueue();
//        for (int i = 0; i < n; i++) {
//            q.add(scanner.nextInt());
//        }
//
//        int answer = 0;
//        while (q.size() > 1) {
//            int num1 = (int) q.poll();
//            int num2 = (int) q.poll();
//            int sum = num1 + num2;
//            answer += sum;
//            q.add(sum);
//        }
//        System.out.println(answer);
//    }
//}

//class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//
//        switch(month){
//            case 3: case 4: case 5:
//                System.out.println("현재의 계절은 봄입니다.");
//                break;
//            case 6: case 7: case 8:
//                System.out.println("여름");
//                break;
//            case 9: case 10: case 11:
//                System.out.println("가을");
//                break;
//            default:
//                System.out.println("겨울");
//        }
//    }
//}

//class Main{
//    public static void main(String[] args){
//        nickname : for(int i = 0; i < 5; i++){
//            System.out.println("이름을 붙일 수 있어!");
//            for(int j = 0 ; j < 6; j++){
//                if(i==3) break nickname; // 한번에 2중 for문 종료
//            }
//        }
//
//        nickname2 : while (true){ // while문도 똑같음
//            int i = 0;
//            for(;;){ // 무한 반복
//                i++;
//                if(i == 30) break nickname2;
//                System.out.println(i);
//            }
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        ArrayList list = new ArrayList<Integer>();
//        for (int i = 0; i < size; i++) {
//            list.add(sc.nextInt());
//        }
//
//        int result = find(0,size-1, list);
//        System.out.println(result);
//    }
//    public static int find(int start, int end, ArrayList<Integer> list) {
//        if (start > end) return -1;
//        int mid = (start + end) / 2;
//        int nowMiddle = list.get(mid);
//        if (nowMiddle == mid) return mid;
//        if (nowMiddle < mid) return find(mid + 1, end, list);
//        else return find(start, mid - 1, list);
//    }
//}

//class Main{
//    public static void main(String[] args){
//        double[] a = new double[3];
//        System.out.println(a[0]);
//    }
//}

//class Solution {
//    public int solution(int n, int[][] edge) {
//        int answer = 0;
//
//        ArrayList<Integer>[] wayList = new ArrayList[n + 1];
//
//        for (int i = 0; i < n + 1; i++) {
//            wayList[i] = new ArrayList<Integer>();
//        }
//
//        for (int[] i : edge) {
//            wayList[i[0]].add(i[1]);
//            wayList[i[1]].add(i[0]);
//        }
//
//        int[] shortestWay = new int[n + 1];
//        for (int i = 2; i < shortestWay.length; i++) {
//            shortestWay[i] = n + 1;
//        }
//
//        ArrayDeque q = new ArrayDeque<Integer>();
//        q.add(1);
//        while (!q.isEmpty()) {
//            int temp = (int) q.removeFirst();
//            for (int i : wayList[temp]) {
//                if (shortestWay[i] > shortestWay[temp] + 1) {
//                    q.add(i);
//                    shortestWay[i] = shortestWay[temp] + 1;
//                }
//            }
//        }
//
//        int max = 0;
//        for (int i = 2; i < shortestWay.length; i++) {
//            if (max < shortestWay[i]) max = shortestWay[i];
//        }
//
//        int count = 0;
//        for (int i = 2; i < shortestWay.length; i++) {
//            if (shortestWay[i] == max) count++;
//        }
//
//        answer = count;
//        return answer;
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        System.out.println(temp.solution(new String[]{"frodo", "front", "frost", "frozen", "frame", "kakao"}, new String[]{"fro??", "????o", "fr???", "fro???", "pro?"}));
//    }
//}
//
//class Solution {
//
//    public int findWord(int start, int end, ArrayList<String> checkList, int rangeStart, int rangeEnd, char[] target) {
//        int count = 0;
//
//        for (String i : checkList) {
//            if (i.substring(rangeStart, rangeEnd).equals(target)) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    public int[] solution(String[] words, String[] queries) {
//        int[] answer = new int[queries.length];
//
//        HashMap<Integer, ArrayList<String>> hash = new HashMap<>();
//
//        for (String i : words) {
//            ArrayList<String> temp = hash.getOrDefault(i.length(), new ArrayList<String>());
//            temp.add(i);
//            hash.put(i.length(), temp);
//        }
//
//        for (int i = 0; i < queries.length; i++) {
//            char[] temp = queries[i].toCharArray();
//            int rangeStart = 0;
//            int rangeEnd = temp.length;
//            if (temp[0] != '?') {
//                for (int j = 0; j < temp.length; j++) {
//                    if (temp[j] == '?') {
//                        rangeEnd = j;
//                        break;
//                    }
//                }
//            } else {
//                for (int j = 0; j < temp.length; j++) {
//                    if (temp[j] != '?') {
//                        rangeStart = j;
//                        break;
//                    }
//                }
//            }
//
//            ArrayList checkList = hash.get(queries[i].length());
//            Collections.sort(checkList);
//            if (checkList != null)
//                answer[i] = findWord(0, checkList.size() - 1, checkList, rangeStart, rangeEnd, queries[i].substring(rangeStart, rangeEnd).toCharArray());
//        }
//
//        return answer;
//    }
//}


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//class Data {
//    int x;
//}
//class PrimitiveParam {
//    public static void main(String[] args) {
//        Data d = new Data();
//        d.x = 10;
//        System.out.println(d.x); // 10
//        change(d.x);
//        System.out.println(d.x); // 10
//    }
//
//    static void change(int x) {
//        x = 1000;
//    }
//}

//class ReferenceParam {
//    public static void main(String[] args) {
//        Data d = new Data();
//        d.x = 10;
//        System.out.println(d.x); // 10
//        change(d);
//        System.out.println(d.x); // 1000
//
//        int[] x = {10};
//        System.out.println(x[0]); // 10
//        change2(x);
//        System.out.println(x[0]); // 1000
//    }
//
//    static void change(Data d) {
//        d.x = 1000;
//    }
//
//    static void change2(int[] x) {
//        x[0] = 1000;
//    }
//
//    static void add(int a, int b, int[] result) {
//        result[0] = a + b;
//    }
//}

//class ReferenceReturn {
//    public static void main(String[] args) {
//        Data d1 = new Data();
//        d1.x = 10;
//        Data d2 = copy(d1);
//        System.out.println(d1.x);
//        System.out.println(d2.x);
//    }
//    static Data copy(Data d) {
//        Data tmp = new Data();
//        tmp.x = d.x; // 값만 복사, tmp는 주소가 다른 새로운 객체
//        return tmp; // 객체 주소 반환
//    }
//}

//class Test {
//    // 인스턴스 멤버
//    void instanceMethod() {
//    }
//
//    int instanceVariable;
//
//    // 클래스 멤버
//    static void staticMethod() {
//    }
//
//    static int staticVariable;
//
//    void instanceMethod2() {
//        instanceMethod(); // 인스턴스 메서드가 인스턴스 메서드 호출 ok
//        System.out.println(instanceVariable); // 인스턴스 메서드가 인스턴스 변수 호출 ok
//
//        staticMethod(); // 인스턴스 메서드가 클래스 메서드 호출 ok
//        System.out.println(staticVariable); // 인스턴스 메서드가 클래스 변수 호출 ok
//    }
//
//    static void staticMethod2() {
////        instanceMethod(); // 클래스 메서드가 인스턴스 메서드 호출 not ok (인스턴스(객체)가 없기 때문)
////        System.out.println(instanceVariable); // 클래스 메서드가 인스턴스 변수 호출 not ok
//        new Test().instanceMethod(); // 참조 변수 없이 일회용 인스턴스(객체) 생성 후 인스턴스 메서드 호출 ok
//        System.out.println(new Test().instanceVariable); // 일회용 인스턴스 생성 후 인스턴스 변수 호출 ok
//
//        staticMethod(); // 클래스 메서드가 클래스 메서드 호출 ok
//        System.out.println(staticVariable); // 클래스 메서드가 클래스 변수 호출 ok
//    }
//}

//class Test {
//    long add(int a, long b) {
//        return a + b;
//    }
//
//    long add(long a, int b) {
//        return a + b;
//    }
//
//    static String varargs(String... str) {
//        return "";
//    }
//
//    static String array(String[] str){
//        return "";
//    }
//
//    public static void main(String[] args) {
//        // 매개변수를 가변인자로 설정하면
//        System.out.println(varargs()); // 인자 x
//        System.out.println(varargs("a")); // 인자 1개
//        System.out.println(varargs("a", "b", "c")); // 인자 여러 개
//        System.out.println(varargs(new String[]{"A", "B"})); // 배열도 가능
//
//        // 매개변수를 배열로 설정하면
////        System.out.println(array()); // 인자 x -> 안됨
//        System.out.println(array(new String[0])); // 무조건 null이나 객체가 필요하다.
////        System.out.println(array({0})); // new String 생략 안됨
//        System.out.println(array(null));
//    }
//}

//class Car {
//    String color;
//    String gearType;
//    int door;
//
//    Car(String color, String gearType, int door) {
//        this.color = color;
//        this.gearType = gearType;
//        this.door = door;
//    }
//
//    Car(String color) {
//        this(color, "auto", 4);
//    }
//
//    Car() {
//        this("white", "auto", 4);
//    }
//
//    Car(Car c){
//        this(c.color, c.gearType, c.door);
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Car c1 = new Car();
//        Car c2 = new Car("blue");
//        Car c3 = new Car("red", "passive", 4);
//    }
//}

//class Engine {
//
//}
//
//class Car {
//    int door = 4; // 기본형 변수 초기화
//    Engine e = new Engine(); // 참조형 변수 초기화
//
//    { // 인스턴스 초기화 블럭
//        int door = 4;
//        System.out.println("인스턴스 초기화 블럭");
//    }
//
//    static { // 클래스 초기화 블럭
//        String color = "blue";
//        System.out.println("클래스 초기화 블럭");
//    }
//}

//class Product {
//    static int count = 0;
//    int serialNo;
//
//    {
//        ++count;
//        serialNo = count;
//    }
//
//    public Product() {
//    } // 기본 생성자 생략 가능
//}
//
//class Text {
//    public static void main(String[] args) {
//        Product p1 = new Product();
//        Product p2 = new Product();
//        Product p3 = new Product();
//
//        System.out.println(p1.serialNo); // 1
//        System.out.println(p2.serialNo); // 2
//        System.out.println(p3.serialNo); // 3
//    }
//}

//class Document {
//    static int count = 0;
//    String name;
//
//    Document(String name) {
//        this.name = name;
//        System.out.println(this.name + " 생성");
//    }
//
//    Document() {
//        this("제목없음" + ++count);
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Document d1 = new Document(); // 제목없음1 생성
//        Document d2 = new Document("자바.txt"); // 자바.txt 생성
//        Document d3 = new Document(); // 제목없음2 생성
//    }
//}

//class Tv {
//    boolean power;
//    int channel;
//
//    void power() {
//        power = !power;
//    }
//
//    void channelUp() {
//        ++channel;
//    }
//
//    void channelDown() {
//        --channel;
//    }
//}
//
//class VCR{
//    boolean power;
//    int counter = 0;
//    void power(){power = !power;}
//    void play(){}
//    void stop(){}
//    void rew(){}
//    void ff(){}
//}
//
//class TVCR extends Tv{
//    VCR vcr = new VCR();
//
//    void play(){
//        vcr.play();
//    }
//
//    void stop(){
//        vcr.stop();
//    }
//
//    void rew(){
//        vcr.rew();
//    }
//
//    void ff(){
//        vcr.ff();
//    }
//}

//class Parent {
//
//    void method() throws IOException, SQLException {
//
//    }
//}
//
//class Child extends Parent {
////    void method() throws Exception{
////
////    }
//
//    void method() throws IOException {
//
//    }
//}

//class Point {
//    int x, y;
//
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    String getLocation() {
//        return "x : " + x + ", y : " + y;
//    }
//}
//
//class Point3D extends Point {
//    int z;
//
////    Point3D(int x, int y, int z){
////        this.x = x;
////        this.y = y;
////        this.z = z;
////    }
//
//    Point3D(int x, int y, int z) {
//        super(x, y);
//        this.z = z;
//    }
//
//    Point3D(){
//        this(100, 200 ,300);
//    }
//
//    String getLocation() {
//        return super.getLocation() + ", z : " + z;
//    }
//}

//final class Singleton {
//    private Singleton() {
//    }
//
//    private static Singleton s = new Singleton();
//
//    public static Singleton getInstance() {
//        if (s == null) s = new Singleton();
//        return s;
//    }
//}

//class Test {
//    public static void main(String[] args) {
//        Parent parentRef1 = null;
//        Child child1 = new Child();
//        child1.parentMethod();
//        child1.childMethod();
//        System.out.println(child1.x); // 200(child)
//        parentRef1 = child1; // 부모타입 변수 <- 자식타입 변수(자식타입 객체), 업캐스팅 표시x
//        parentRef1.parentMethod();
////        parentRef.childMethod(); // 자식클래스의 메서드는 더이상 사용x
//        System.out.println(parentRef1.x); // 100(parent)
//
//        Parent parentRef2 = null;
////        Child child2 = (Child) new Parent(); // 이거 자체가 안됨
////        parentRef2 = child2; // 부모타입 변수 <- 자식타입 변수(다운캐스팅한 부모타입 객체), 업캐스팅 표시x
////        parentRef2.parentMethod();
////        parentRef2.childMethod(); // 자식클래스의 메서드는 더이상 사용x
//
//        checkChild(child1); // 변환 가능
//// ============================================================================================================
//
//        Child childRef1 = null;
//        Parent parent1 = new Parent();
//        parent1.parentMethod();
//        System.out.println(parent1.x); // 100
////        childRef1 = (Child) parent1; // 자식타입 변수 <- 부모타입 변수(부모타입 객체), 다운캐스팅 표시 있어도 안됨
////        childRef1.parentMethod();
////        childRef1.childMethod();
////        System.out.println(childRef1.x);
//
//        Child childRef2 = null;
//        Parent parent2 = new Child();
//        parent2.parentMethod();
////        parent2.childMethod();
//        System.out.println(parent2.x); // 100(parent)
//        childRef2 = (Child) parent2; // 자식타입 변수 <- 부모타입 변수(자식타입 객체), 다운캐스팅 표시
//        childRef2.parentMethod();
//        childRef2.childMethod();
//        System.out.println(childRef2.x); // 200(child)
//
//        checkParent(parent1); // 변환 안됨
//        checkParent(parent2); // 변환 가능
//    }
//
//    static void checkParent(Parent parent) {
//        if (parent instanceof Child) {
//            System.out.println("변환 가능");
//            Child child = (Child) parent;
//            child.parentMethod();
//            child.childMethod();
//        } else {
//            System.out.println("변환 안됨");
//        }
//    }
//
//    static void checkChild(Child child) {
//        if (child instanceof Parent) {
//            System.out.println("변환 가능");
//            Parent parent = child;
//            parent.parentMethod();
////            parent.childMethod();
//        } else {
//            System.out.println("변환 안됨");
//        }
//    }
//}
//
//class Parent {
//    int x = 100;
//    void parentMethod() {
//        System.out.println("부모1");
//    }
//}
//
//class Child extends Parent {
//    int x = 200;
//    void childMethod() {
//        System.out.println("자식");
//    }
//}

//abstract class Player {
//    boolean pause;
//    int currentPos;
//
//    Player() {
//        pause = false;
//        currentPos = 0;
//    }
//
//    abstract protected void play(int pos);
//
//    abstract void stop();
//
//    void play() {
//        play(currentPos); // 추상클래스 내부에서 추상메서드를 활용할 수 있음
//    }
//
//    void pause() {
//        if (pause) {
//            pause = false;
//            play(currentPos); // 추상클래스 내부에서 추상메서드를 활용할 수 있음
//        } else {
//            pause = true;
//            stop(); // 추상클래스 내부에서 추상메서드를 활용할 수 있음
//        }
//    }
//}
//
//class Sample extends Player{
//
//    @Override
//    protected void play(int pos) {
//
//    }
//
//    @Override
//    void stop() {
//
//    }
//}

//interface 인터페이스이름{
//    public static final 타입 상수이름 = 값;
//    public abstract 메서드이름(매개변수목록);
//}

//interface A {
//    void move(int x, int y);
//}
//
//interface B {
//    void attack(int i);
//}
//
//interface C extends A, B {
//}
//
//class Test implements C {
//
//    @Override
//    public void move(int x, int y) {
//
//    }
//
//    @Override
//    public void attack(int i) {
//
//    }
//}
//
//abstract class Test2 implements C {
//    @Override
//    public void attack(int i) {
//
//    }
//}
//
//abstract class D {
//    abstract void move();
//}
//
//class Test3 extends D implements C{
//
//    @Override
//    public void move(int x, int y) {
//
//    }
//
//    @Override
//    public void attack(int i) {
//
//    }
//
//    @Override
//    void move() {
//
//    }
//}

//interface Parseable {
//    public void parse(String fileName);
//}
//
//class XMLParser implements Parseable {
//    @Override
//    public void parse(String fileName) {
//        System.out.println(fileName + " XML parsing");
//    }
//}
//
//class HTMLParser implements Parseable {
//
//    @Override
//    public void parse(String fileName) {
//        System.out.println(fileName + " HTML parsing");
//    }
//}
//
//class ParseManager {
//    public static Parseable getParser(String type) {
//        if (type.equals("XML")) {
//            return new XMLParser();
//        } else {
//            return new HTMLParser();
//        }
//    }
//}

//interface I {
//    public abstract void play();
//}
//
//class AImpl implements I{
//    @Override
//    public void play() {
//        System.out.println("in A");
//    }
//}
//
//class BImpl implements I{
//    @Override
//    public void play() {
//        System.out.println("in B");
//    }
//}
//class A implements I {
//    AImpl impl = new AImpl();
//    @Override
//    public void play() {
//        impl.play();
////        System.out.println("in A");
//    }
//}
//
//class B implements I {
//    BImpl impl = new BImpl();
//    @Override
//    public void play() {
//        impl.play();
////        System.out.println("in B");
//    }
//}
//
//class InstanceManager {
//    public static I getAInstance() {
//        return new A();
//    }
//
//    public static I getBInstance() {
//        return new B();
//    }
//}
//
//class C {
//    void autoPlay(I i) {
//        i.play();
//    }
//    void autoPlay() {
//        I a = InstanceManager.getAInstance();
//        a.play();
//        I b = InstanceManager.getBInstance();
//        b.play();
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        C c = new C();
////        c.autoPlay(new A()); // in A
////        c.autoPlay(new B()); // in B
//        c.autoPlay();
//    }
//}

//class Outer {
//    private class InstanceInner {
//        int a = 100;
//        static int b = 200;
//        static final int c = 300;
//    }
//
//    protected static class StaticInner {
//        int a = 100;
//        static int b = 200;
//        static final int c = 300;
//    }
//
//    void method() {
//        class LocalInner {
//            int a = 100;
//            static int b = 200;
//            static final int c = 300;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(InstanceInner.b);
//        System.out.println(StaticInner.b);
//    }
//}

//class Inner {
//    public static void main(String[] args) {
//        Button b = new Button("start");
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("this is anonymous class");
//            }
//        });
//    }
//}

//class ExceptionEx {
//    public static void main(String[] args) {
//        System.out.println(1);
//        try {
//            System.out.println(2);
//            System.out.println(0 / 0); // 예외 발생
//            System.out.println(3); // 출력 안되
//        } catch (ArithmeticException ae) {
//            ae.printStackTrace(); // java.lang.ArithmeticException: / by zero at ExceptionEx.main(Main.java:1680)
//            System.out.println("message : " + ae.getMessage()); // message : / by zero
//            System.out.println(4);
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
//        System.out.println(5);
//    }
//}


//class ExceptionEx {
//    //    public static void main(String[] args) {
////        System.out.println(1);
////        try {
////            Exception e = new Exception("에러");
////            throw e;
//////            throw new Exception("이렇게도 보낼 수 있다.");
////        } catch (ArithmeticException ae) {
////            ae.printStackTrace(); // java.lang.ArithmeticException: / by zero at ExceptionEx.main(Main.java:1680)
////            System.out.println("message : " + ae.getMessage()); // message : / by zero
////            System.out.println(4);
////        } catch (Exception e) {
////            System.out.println("Exception");
////        }
////        System.out.println(5);
////    }
//    public static void main(String[] args) {
//        method1();
//    }
//
//    static void method1() {
//        try {
//            method2();
//        } catch (Exception e) {
//            System.out.println("여기서 예외처리됨");
//            e.printStackTrace();
//        }
//    }
//
//    static void method2() throws Exception {
//        method3();
//    }
//
//    static void method3() throws Exception {
//        throw new Exception("에러 발생");
//    }
//
//}

//class ExceptionEx {
//    public static void main(String[] args) {
//        File f = createFile(args[0]);
//        System.out.println("main에서는 에러가 발생하는지도 모름");
//    }
//
//    static File createFile(String fileName) {
//        try {
//            if (fileName == null || fileName.equals(""))
//                throw new Exception("예외 발생시킴");
//        } catch (Exception e) {
//            fileName = "제목없음.txt";
//        } finally { // 예외가 발생하건 말건 항상 실행되는 블록
//            File f = new File(fileName);
//            createNewFile(f);
//            return f;
//        }
//    }
//
//    static void createNewFile(File f) { // 임시로 만든 메서드라고 한다.(중요x)
//        try {
//            f.createNewFile(); // 파일 생성
//        } catch (Exception e) {
//        }
//    }
//}

//class ExceptionEx {
//    public static void main(String[] args) {
//        try {
//            File f = createFile(args[0]);
//            System.out.println("예외 상황 x");
//        } catch (Exception e) {
//            System.out.println("예외 상황 발생");
//        }
//    }
//
//    static File createFile(String fileName) throws Exception {
//        if (fileName == null || fileName == "")
//            throw new Exception("예외 발생시킴");
//        File f = new File(fileName);
//        f.createNewFile();
//        return f;
//    }
//
//    static void createNewFile(File f) { // 임시로 만든 메서드라고 한다.(중요x)
//        try {
//            f.createNewFile(); // 파일 생성
//        } catch (Exception e) {
//        }
//    }
//}

//class ExceptionEx {
//    public static void main(String[] args) {
//        try {
//            // 예외가 발생할 가능성이 있는 문장들을 넣는다.
//        } catch (Exception e) {
//            // 예외처리를 위한 문장을 적는다.
//        } finally {
//            // 예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣는다.
//            // finally블럭은 try-catch문의 맨 마지막에 위치해야 한다.
//        }
//    }
//}

//class ExceptionEx {
//    public static void main(String[] args) {
//        try {
//            method1();
//        } catch (Exception e) {
//            System.out.println("호출한 쪽에서 처리");
//        }
//        System.out.println("성공");
//    }
//
//    static void method1() throws Exception {
//        try {
//            System.out.println("메서드 내부에서 해결 한번");
//            throw new Exception("내부 catch에서 해결");
//        } catch (Exception e) { // 일단 자체 해결
//            e.printStackTrace();
//            throw e; // 다시 한번 더 던지기
//        } finally {
//            System.out.println("무조건");
//        }
////        System.out.println("이건 안됨");
//    }
//}

//class ExceptionEx {
//    public static void main(String[] args) {
//        try {
//            int result = method1();
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("호출한 쪽에서 처리");
//        }
//        System.out.println("성공");
//    }
//
//    static int method1() throws Exception {
//        try {
//            System.out.println("메서드 내부에서 해결 한번");
//            throw new Exception("내부 catch에서 해결");
////            return 0;
//        } catch (Exception e) { // 일단 자체 해결
//            e.printStackTrace();
//            throw e; // 다시 한번 더 던지기
////            return 1;
//        } finally {
//            System.out.println("무조건");
////            return 3;
//        }
////        System.out.println("이건 안됨");
//    }
//}

//class ChinedException {
//    public static void main(String[] args) {
//        try {
//            install();
//        } catch (NewException1 e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    static void install() throws NewException1 {
//        try {
//            throwAllException();
//        } catch (NewException1 e) {
//            throw e;
//        } finally {
//            System.out.println("던져도 실행됨");
//        }
//    }
//
//    static void throwAllException() throws NewException1 { // RuntimeException을 던진건 표시 안해도됨
//        Boolean result1 = false;
//        Boolean reuslt2 = false;
//        if (!result1) throw new NewException1("첫번째 예외");
//        if (!reuslt2) throw new RuntimeException(new NewException2("두번째 예외"));
//    }
//}
//
//class NewException1 extends Exception {
//    NewException1(String msg) {
//        super(msg);
//    }
//}
//
//class NewException2 extends Exception {
//    NewException2(String msg) {
//        super(msg);
//    }
//}