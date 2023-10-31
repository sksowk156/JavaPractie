//package lambda;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Objects;
//import java.util.SimpleTimeZone;
//import java.util.function.BiFunction;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
////@FunctionalInterface
////interface MyFunc {
////    //    public abstract int method(int a, int b);
////    void run();
////}
////
////class Out {
////    int outVal = 10;
////
////    class In {
////        int inVal = 20;
////
////        void inMethod(int temp) {
////            int inMethodVal = 30;
////            MyFunc test = () -> {
////                System.out.println(++outVal); // 11
////                System.out.println(++inVal); // 21
////                System.out.println(temp); // 40
////                System.out.println(inMethodVal); // 30
////            };
////            test.run();
////        }
////    }
////}
////
////class Myclass{
////    Boolean test(Myclass a){
////        return true;
////    }
////}
//public class LambdaExpression {
//    public static void main(String[] args) {
////        Function<String, Integer> a = (String s) -> Integer.parseInt(s);
////        Function<String, Integer> b = Integer::parseInt;
////        System.out.println(a.apply("1"));
////        System.out.println(b.apply("1"));
////
////        Myclass temp = new Myclass();
////        Function<Myclass, Boolean> c = temp::test;
//////        Function<Myclass, Boolean> d = Myclass::test;
////        BiFunction<String, String, Boolean> f = String::equals;
//
////        Predicate<Integer> a = i -> i < 100;
////        Predicate<Integer> b = i -> i < 200;
////        Predicate<Integer> c = i -> i % 2 == 0;
////
////        Predicate<Integer> notA = a.negate();
////        Predicate<Integer> allMethod = notA.and(b).or(c); // !false && true || false
////        System.out.println(allMethod.test(150)); // true
////
////        Predicate<String> d = Predicate.isEqual("abc");
////        boolean result = d.test("abc");
////        System.out.println(result); // true
//
////        Function<String, Integer> a = (s) -> Integer.parseInt(s, 16);
////        Function<Integer, String> b = (i) -> Integer.toBinaryString(i);
////        Function<String, String> c = a.andThen(b);
////        System.out.println(c.apply("FF")); // 11111111
////        Function<Integer, Integer> d = a.compose(b);
////        System.out.println(d.apply(2)); // 16
////        ArrayList<Integer> list = new ArrayList<>();
////        for (int i = 0; i < 10; i++) {
////            list.add(i);
////        }
////        HashMap<String, String> map = new HashMap<>();
////        map.put("1", "1");
////        map.put("2", "2");
////        map.put("3", "3");
////
////        list.forEach(i -> System.out.println(i));
////        System.out.println();
////        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
////        System.out.println(list);
////        list.replaceAll(i -> i * 10); // list의 각요소 곱하기 10
////        System.out.println(list);
////        map.forEach((k, v) -> System.out.println(k + " " + v));
////        System.out.println();
//
////        Predicate<String> forCondition = s -> s.length() == 0;
////        if(!forCondition.test("Predicate인터페이스의 test메서드")){
////            System.out.println("테스트"); // 테스트
////        }
//
//        //        Out outer = new Out();
////        Out.In in = outer.new In();
////        in.inMethod(40);
//
////        MyFunc myFunc = new MyFunc() {
////            @Override
////            public int method(int a, int b) {
////                return a + b;
////            }
////        };
////
////        MyFunc myFunc1 = (a, b) -> a + b;
////
////        int test1 = myFunc.method(1, 2); // 3
////        int test2 = myFunc1.method(1, 2); // 3
////        MyFunc f1 = () -> System.out.println("매개변수타입이 함수형 인터페이스");
////        execute(f1); // 매개변수타입이 함수형 인터페이스
////
////        MyFunc f2 = getMyFunc();
////        f2.run(); // 반환타입이 함수형 인터페이스
////
////        Object f3 = (Object) (MyFunc) () -> System.out.println("이렇게");
////        String str1 = f3.toString();
//
//    }
//
////    static void execute(MyFunc f) {
////        f.run();
////    }
////
////    static MyFunc getMyFunc() {
////        MyFunc f = () -> System.out.println("반환타입이 함수형 인터페이스");
////        return f;
////    }
//}
