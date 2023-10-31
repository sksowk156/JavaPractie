package stream;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
//        String[] strArray = {"aaa", "bbb", "ccc"}; // 배열
//        List<String> strList = Arrays.asList(strArray); // 리스트
//
//        Stream<String> strStream1 = Arrays.stream(strArray); // 배열을 스트림으로 생성
//        Stream<String> strStream2 = strList.stream(); // 리스트를 스트림으로 생성

//        strStream1.sorted().forEach(System.out::println);
//        strStream2.sorted().forEach(System.out::println);

//        List<String> sortedList1 = strStream1.sorted().collect(Collectors.toList());
//        List<String> sortedList2 = strStream2.sorted().collect(Collectors.toList());

//        System.out.println(sortedList1); // [aaa, bbb, ccc]
//        System.out.println(sortedList2); // [aaa, bbb, ccc]
//        strStream1.sorted().forEach(System.out::println);
//        strStream2.distinct().limit(5).sorted().forEach(System.out::println);
//        int[] intArray = {1, 2, 3, 4, 5};
//        IntStream intStream = Arrays.stream(intArray);
//        Double sum = intStream.parallel()
//                .mapToDouble(s -> s * s / 3.0)
//                .sum();
//        System.out.println(sum); // 18.3333
//        String[] strArray = {"a", "bb", "ccc", "dddd"};
//        Stream<String> strStream = Arrays.stream(strArray);
//        int sum = strStream.parallel()
//                .mapToInt(s -> s.length())
//                .sum();
//        System.out.println(sum);
        // list -> Stream
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();
        // Array -> Stream
        Stream<String> strStream1 = Stream.of("a", "b", "c");
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3);
        IntStream intStream1 = IntStream.of(1, 2, 3, 4);
        IntStream intStream2 = IntStream.of(new int[]{1, 2, 3, 4});
        IntStream intStream3 = Arrays.stream(new int[]{1, 2, 3, 4});
        IntStream intStream4 = Arrays.stream(new int[]{1, 2, 3, 4}, 0, 4);
        // 특정 범위의 정수 Stream
        IntStream rangeStream = IntStream.range(1, 5); //1,2,3,4
        IntStream rangeStream2 = IntStream.rangeClosed(1, 5); // 1,2,3,4,5
        // 임의의 수로 이루어진 Stream
        IntStream randomStream = new Random().ints(); // 무한 난수 스트림
        randomStream.limit(5).forEach(System.out::println); // limit()로 무한 스트림을 유한 스트림으로 변경해준다.

        IntStream randomStream2 = new Random().ints(5); // 유한 난수 스트림

        IntStream randomRangeStream = new Random().ints(5, 10, 20); // 10 <= x < 20 범위의 유한 난수 스트림
        // 람다식 Stream
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2); // 매개 변수가 있는 람다식을 무한히 실행시켜 값을 만드는 무한 스트림, 입력한 seed 값은 초기 값으로 람다의 결과 값이 seed르 재입력되면서 무한 스트림을 형성한다.

        Stream<Integer> oneStream = Stream.generate(() -> 1); // 매개 변수가 없는 람다식을 무한히 실행시켜 값을 만드는 무한 스트림
        Stream<Double> rnadomStream = Stream.generate(Math::random);

        IntStream evenStream2 = Stream.iterate(0, n->n+2).mapToInt(Integer::valueOf); // 무한 람다 Stream을 기본형 Stream 타입으로 변경
        Stream<Integer> stream = evenStream2.boxed(); // 기본형 무한 람다 Stream을 그냥 Stream 타입으로 변경


        // 빈 Stream 생성
        Stream emptyStream = Stream.empty(); // null보다 빈 Stream이 낫다.
        long count = emptyStream.count(); // 0

        // Stream 연결
        Stream<String> strStreamForConcat1 = Stream.of(new String[]{"aa","bb","cc"});
        Stream<String> strStreamForConcat2 = Arrays.stream(new String[]{"11","22","33"});
        Stream<String> strStreamConcated = Stream.concat(strStreamForConcat1, strStreamForConcat2);
        strStreamConcated.forEach(System.out::println);
    }
}
