package javalang;

import java.sql.Array;
import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//        CloneClass original1 = new CloneClass(new Point(1, 2), 3);
//        CloneClass copy1 = original1.shallowCopy();
//        CloneClass copy2 = original1.deepCopy();
//        copy1.p.x = 3; copy1.r = 33;
//        copy2.p.x = 4; copy2.r = 44;
//        System.out.println(original1.toString()); // (3,2), 3
//        System.out.println(copy1.toString()); // (3,2), 33
//        System.out.println(copy2); // (4,2), 44
//
//        // 참조 클래스 배열 5
//        CloneClass[] original2 = new CloneClass[2];
//        original2[0] = new CloneClass(new Point(1,2), 3);
//        original2[1] = new CloneClass(new Point(4,5), 6);
//        CloneClass[] copy3 = original2.clone();
//        CloneClass[] copy4 = new CloneClass[2];
//        for(int i = 0; i < 2; i++){
//            copy4[i] = original2[i].shallowCopy();
//        }
//        CloneClass[] copy5 = new CloneClass[2];
//        for(int i = 0; i < 2; i++){
//            copy5[i] = original2[i].deepCopy();
//        }
//        copy3[0].p.x = 4; copy3[0].r = 44;
//        copy4[0].p.x = 5; copy4[0].r = 55;
//        copy5[0].p.x = 6; copy5[0].r = 66;
//
//        System.out.println(original2[0].toString()); // (5, 2) 44
//        System.out.println(copy3[0].toString()); // (5, 2) 44
//        System.out.println(copy4[0].toString()); // (5, 2) 55
//        System.out.println(copy5[0].toString()); // (5, 2) 66
//    }
//}
//
//class CloneClass implements Cloneable { // 사용자 정의 클래스
//    Point p; // 내부에 참조 변수가 존재
//    double r;
//
//    CloneClass(Point p, double r) {
//        this.p = p;
//        this.r = r;
//    }
//
//    @Override
//    public String toString() {
//        return "p = " + p + " r + " + r;
//    }
//
//    public CloneClass shallowCopy() { // 얕은 복사
//        Object obj = null;
//        try {
//            obj = super.clone();
//        } catch (CloneNotSupportedException e) {
//        }
//
//        return (CloneClass) obj;
//    }
//
//    public CloneClass deepCopy() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//        } catch (CloneNotSupportedException e) {
//        }
//
//        CloneClass temp = (CloneClass) obj;
//        temp.p = new Point(this.p.x, this.p.y); // 참조변수에 직접 값 대입
//
//        return (CloneClass) obj;
//    }
//}
//
//class Point {
//    int x, y;
//
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public String toString() {
//        return "(" + x + ", " + y + ")";
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Card c1 = new Card("heart", 3);
////        Card c2 = Card.class.newInstance();
//        System.out.println(c1); // heart : 3
//
//        Class cObj = c1.getClass(); // Class 객체를 통해서 객체 생성
//        System.out.println(cObj.getName()); // javalang.Card
//        System.out.println(cObj.toGenericString()); // final class javalang.Card
//        System.out.println(cObj.toString()); // class javalang.Card
//    }
//}
//
//final class Card {
//    String kind;
//    int num;
//
//    Card(String kind, int num) {
//        this.kind = kind;
//        this.num = num;
//    }
//
//    Card() {
//        this("spade", 1);
//    }
//
//    public String toString() {
//        return kind + " : " + num;
//    }
//}

public class Main {
    public static void main(String[] args) {
//        String str1 = "abc"; // 기존에 있던 인스턴스를 참조하는 것
//        String str2 = "abc";
//        String str3 = new String("abc"); // 새로운 인스턴스를 생성하는 것
//        String str4 = new String("abc");
//
//        System.out.println((str1 == str2) + " " + str1.equals(str2)); // true true
//        System.out.println((str2 == str3) + " " + str2.equals(str3)); // false true
//        System.out.println((str3 == str4) + " " + str3.equals(str4)); // false true
//        char[] c = {'h', 'e', 'l', 'l', 'o'};
//        String s = new String(c);
//        System.out.println(s); // hello
//        String s = "abc";
//        char c = s.charAt(1); // b
//        System.out.println(c);
//        String a = "abcdefg";
//        boolean b = a.contains("ab"); // true
//        System.out.println(b);
//        String ab = "aabbaabb";
//        String replace = ab.replaceAll("aa", "AA"); // AAbbAAbb
//        System.out.println(replace);

//        String animals = "dog, cat, bear";
//        String[] arr = animals.split(", ");
//        System.out.println(Arrays.toString(arr)); // [dog, cat, bear]
//        String[] arr2 = animals.split(",");
//        System.out.println(Arrays.toString(arr2)); // [dog,  cat,  bear]
//        String s = "   hel  lo   ";
//        String result = s.trim();
//        System.out.println(result);
//        String b = String.valueOf(true);
//        String c = String.valueOf('c');
//        String f = String.valueOf(1f);
//        Date object = new Date();
//        String o = String.valueOf(object);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(f);
//        System.out.println(o);
//        String animals = "dog,cat,bear";
//        String[] arr = animals.split(",");
//        System.out.println(Arrays.toString(arr));
//        String str = String.join("-", arr);
//        System.out.println(str);
//        String str = String.format("%d 더하기 %d는 %d입니다.", 3, 5, 3 + 5);
//        System.out.println(str);
//
//        int i = 100;
//        String str1 = i + "";
//        String str2 = String.valueOf(i);
//        int i = Integer.valueOf("100"); // 100
//        boolean b = Boolean.valueOf("true"); //true
//        boolean b1 = Boolean.valueOf("True"); //true
//        boolean b2 = Boolean.valueOf("ttrue"); //false
//        Double d = Double.valueOf("2.0"); //2.0
//        Double d1 = Double.valueOf("2f"); //2.0

//        StringBuffer sb = new StringBuffer("abc");
//        sb.append("123").append("ABC"); //abc123ABC
//        System.out.println(sb);

//        StringBuffer sb = new StringBuffer("abc");
//        StringBuffer sb2 = new StringBuffer("abc");
//        System.out.println(sb == sb2);
//        System.out.println(sb.equals(sb2));
//
//        String s = sb.toString();
//        String s2 = sb.toString();
//        System.out.println(s == s2);
//        System.out.println(s.equals(s2));
//        StringBuffer sb = new StringBuffer(100);
//        sb.append("asd");
//
//        int bufferSize = sb.capacity();
//        int stringSize = sb.length();
//
//        System.out.println(bufferSize); //100
//        System.out.println(stringSize); //3
//        StringBuffer sb = new StringBuffer("01234567");
//        sb.replace(3, 6, "XX"); //012XX67
//        System.out.println(sb);
//        double b = Math.toRadians(45);
//        double a = Math.toDegrees(3.14);


//        Boolean b= new Boolean(true);
//        Integer a = Integer.valueOf(128);
//        Integer b = Integer.valueOf(128);
//
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(b));
//        System.out.println(a.compareTo(b));
//        System.out.println(a.toString()+" "+b.toString());

//        int a = Integer.parseInt("100",2);
//        System.out.println(a); // 4
//        setName2(null); // Exception in thread "main" java.lang.NullPointerException: name must not be null

        String[] str1 = new String[]{"aaa","bbb"};
        String[] str3 = new String[]{"aaa","bbb"};

        System.out.println(str1==str3); // false
        System.out.println(str1.equals(str3)); // false
        System.out.println(Objects.equals(str1, str3)); // false
        System.out.println(Objects.deepEquals(str1, str3)); // true

        String[][] str = new String[][]{{"aaa","bbb"},{"ccc","ddd"}};
        String[][] str2 = new String[][]{{"aaa","bbb"},{"ccc","ddd"}};

        System.out.println(str==str2); // false
        System.out.println(str.equals(str2)); // false
        System.out.println(Objects.equals(str, str2)); // false
        System.out.println(Objects.deepEquals(str, str2)); // true
    }
    static String name;
    static void setName(String name){
        if(name == null) throw new NullPointerException("name must not be null");
        Main.name = name;
    }

    static void setName2(String name){
        Main.name = Objects.requireNonNull(name, "name must not be null");
    }
}
