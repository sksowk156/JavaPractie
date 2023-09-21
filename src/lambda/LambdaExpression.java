package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.SimpleTimeZone;
import java.util.function.Predicate;

@FunctionalInterface
interface MyFunc {
    //    public abstract int method(int a, int b);
    void run();
}

class Out {
    int outVal = 10;

    class In {
        int inVal = 20;

        void inMethod(int temp) {
            int inMethodVal = 30;
            MyFunc test = () -> {
                System.out.println(++outVal); // 11
                System.out.println(++inVal); // 21
                System.out.println(temp); // 40
                System.out.println(inMethodVal); // 30
            };
            test.run();
        }
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");

        list.forEach(i -> System.out.println(i));
        System.out.println();
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);
        list.replaceAll(i -> i * 10); // list의 각요소 곱하기 10
        System.out.println(list);
        map.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();

//        Predicate<String> forCondition = s -> s.length() == 0;
//        if(!forCondition.test("Predicate인터페이스의 test메서드")){
//            System.out.println("테스트"); // 테스트
//        }

        //        Out outer = new Out();
//        Out.In in = outer.new In();
//        in.inMethod(40);

//        MyFunc myFunc = new MyFunc() {
//            @Override
//            public int method(int a, int b) {
//                return a + b;
//            }
//        };
//
//        MyFunc myFunc1 = (a, b) -> a + b;
//
//        int test1 = myFunc.method(1, 2); // 3
//        int test2 = myFunc1.method(1, 2); // 3
//        MyFunc f1 = () -> System.out.println("매개변수타입이 함수형 인터페이스");
//        execute(f1); // 매개변수타입이 함수형 인터페이스
//
//        MyFunc f2 = getMyFunc();
//        f2.run(); // 반환타입이 함수형 인터페이스
//
//        Object f3 = (Object) (MyFunc) () -> System.out.println("이렇게");
//        String str1 = f3.toString();

    }

    static void execute(MyFunc f) {
        f.run();
    }

    static MyFunc getMyFunc() {
        MyFunc f = () -> System.out.println("반환타입이 함수형 인터페이스");
        return f;
    }
}
