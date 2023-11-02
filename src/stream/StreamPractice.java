package stream;

import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student {
    String name;

    String getName() {
        return name;
    }

    int ban;

    int getBan() {
        return ban;
    }

    int totalScore;

    int getTotalScore() {
        return totalScore;
    }

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }
}

public class StreamPractice {

    public static Stream<Student> makeStreamSource() {
        return Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
        );
    }

    public static void main(String[] args) {
        Stream<String> strStrm = Stream.of("abc", "def", "ghi");
        Stream<String> strStrm2 = Stream.of("ABC", "GHI", "JKLMN");
        Stream<Stream<String>> strmStrm = Stream.of(strStrm, strStrm2);
        Stream<String> strStream = strmStrm
                .map(s -> s.toArray(String[]::new)) // Stream<Stream<String>> -> Stream<String[]>
                .flatMap(Arrays::stream); // Stream<String[]> -> Stream<String>
        strStream.forEach(System.out::println);

//        Stream<String[]> strArrStrm = Stream.of(
//                new String[]{"abc", "def", "ghi"},
//                new String[]{"ABC", "GHI", "JKLMN"}
//        );
//
//        Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream);
//        strStrStrm.forEach(System.out::println); // java.util.stream.ReferencePipeline$Head@3d075dc0
//
//        Stream<String[]> strArrStrm2 = Stream.of(
//                new String[]{"abc", "def", "ghi"},
//                new String[]{"ABC", "GHI", "JKLMN"}
//        );
//        Stream<String> strStrm = strArrStrm2.flatMap(Arrays::stream);
//        strStrm.forEach(System.out::println);


//        IntStream intStream = new Random().ints(1, 46);
//        Stream<String> lottoStream = intStream.distinct().limit(6).sorted()
//                .mapToObj(i -> i + ", ");
//        lottoStream.forEach(System.out::print); // 6, 19, 37, 39, 41, 44,

//        Stream<Student> studentStream = makeStreamSource();
//        IntStream scoreStream = studentStream.mapToInt(Student::getTotalScore);
//        IntSummaryStatistics statistics = scoreStream.summaryStatistics();
//        System.out.println(statistics.getCount()); // 7
//        System.out.println(statistics.getSum()); // 1420
//        System.out.println(statistics.getAverage()); // 202.85714285714286
//        System.out.println(statistics.getMax()); // 300
//        System.out.println(statistics.getMin()); // 100

//        Stream<Student> studentStream1 = makeStreamSource();
//        IntStream scoreStream = studentStream1.mapToInt(Student::getTotalScore);
//        long totalScoreSum = scoreStream.sum();
//        System.out.println(totalScoreSum);
//
//        Stream<Student> studentStream2 = makeStreamSource();
//        IntStream scoreStream2 = studentStream2.mapToInt(Student::getTotalScore);
//        OptionalDouble totalScoreAverage = scoreStream2.average();
//        double average = totalScoreAverage.getAsDouble(); // OptionalDouble에서 Double을 꺼내온다.
//        System.out.println(average);
//
//
//        Stream<Student> studentStream3 = makeStreamSource();
//        IntStream scoreStream3 = studentStream3.mapToInt(Student::getTotalScore);
//        OptionalInt totalScoreMax = scoreStream3.max();
//        int max = totalScoreMax.getAsInt(); // OptionalInt에서 Int를 꺼내온다.
//        System.out.println(max);
//
//        Stream<Student> studentStream4 = makeStreamSource();
//        IntStream scoreStream4 = studentStream4.mapToInt(Student::getTotalScore);
//        OptionalInt totalScoreMin = scoreStream4.min();
//        int min = totalScoreMin.getAsInt(); // OptionalInt에서 Int를 꺼내온다.
//        System.out.println(min);


//        Stream<File> fileStream = Stream.of(
//                new File("Ex1.java"),
//                new File("Ex1"),
//                new File("Ex1.bak"),
//                new File("Ex2.java"),
//                new File("Ex1.txt")
//        );
//
//    fileStream.map(File::getName)
//            .filter(s -> s.indexOf('.') != -1)
//            .peek(s -> System.out.printf("1. filename = %s%n", s))
//            .map(s -> s.substring(s.indexOf('.') + 1))
//            .peek(s -> System.out.printf("2. filename = %s%n", s))
//            .map(String::toUpperCase)
//            .peek(s -> System.out.printf("3. filename = %s%n", s))
//            .distinct()
//            .peek(s -> System.out.printf("4. filename = %s%n", s))
//            .forEach(System.out::println);


//        Stream<Student> studentStream = Stream.of(
//                new Student("이자바", 3, 300),
//                new Student("김자바", 1, 200),
//                new Student("안자바", 2, 100),
//                new Student("박자바", 2, 150),
//                new Student("소자바", 1, 200),
//                new Student("나자바", 3, 290),
//                new Student("감자바", 3, 180)
//        );
//
//        studentStream.sorted(Comparator.comparing(Student::getBan)
//                        .thenComparing(Comparator.comparing(Student::getTotalScore).reversed()))
//                .forEach(System.out::println);
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
//        // list -> Stream
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> intStream = list.stream();
//        // Array -> Stream
//        Stream<String> strStream1 = Stream.of("a", "b", "c");
//        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
//        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
//        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3);
//        IntStream intStream1 = IntStream.of(1, 2, 3, 4);
//        IntStream intStream2 = IntStream.of(new int[]{1, 2, 3, 4});
//        IntStream intStream3 = Arrays.stream(new int[]{1, 2, 3, 4});
//        IntStream intStream4 = Arrays.stream(new int[]{1, 2, 3, 4}, 0, 4);
//        // 특정 범위의 정수 Stream
//        IntStream rangeStream = IntStream.range(1, 5); //1,2,3,4
//        IntStream rangeStream2 = IntStream.rangeClosed(1, 5); // 1,2,3,4,5
//        // 임의의 수로 이루어진 Stream
//        IntStream randomStream = new Random().ints(); // 무한 난수 스트림
//        randomStream.limit(5).forEach(System.out::println); // limit()로 무한 스트림을 유한 스트림으로 변경해준다.
//
//        IntStream randomStream2 = new Random().ints(5); // 유한 난수 스트림
//
//        IntStream randomRangeStream = new Random().ints(5, 10, 20); // 10 <= x < 20 범위의 유한 난수 스트림
//        // 람다식 Stream
//        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2); // 매개 변수가 있는 람다식을 무한히 실행시켜 값을 만드는 무한 스트림, 입력한 seed 값은 초기 값으로 람다의 결과 값이 seed르 재입력되면서 무한 스트림을 형성한다.
//
//        Stream<Integer> oneStream = Stream.generate(() -> 1); // 매개 변수가 없는 람다식을 무한히 실행시켜 값을 만드는 무한 스트림
//        Stream<Double> rnadomStream = Stream.generate(Math::random);
//
//        IntStream evenStream2 = Stream.iterate(0, n->n+2).mapToInt(Integer::valueOf); // 무한 람다 Stream을 기본형 Stream 타입으로 변경
//        Stream<Integer> stream = evenStream2.boxed(); // 기본형 무한 람다 Stream을 그냥 Stream 타입으로 변경
//
//
//        // 빈 Stream 생성
//        Stream emptyStream = Stream.empty(); // null보다 빈 Stream이 낫다.
//        long count = emptyStream.count(); // 0
//
//        // Stream 연결
//        Stream<String> strStreamForConcat1 = Stream.of(new String[]{"aa","bb","cc"});
//        Stream<String> strStreamForConcat2 = Arrays.stream(new String[]{"11","22","33"});
//        Stream<String> strStreamConcated = Stream.concat(strStreamForConcat1, strStreamForConcat2);
//        strStreamConcated.forEach(System.out::println);
//        IntStream intStream = IntStream.rangeClosed(1, 10);//1~10의 스트림
//        intStream.skip(3).limit(5).forEach(System.out::println); // 45678
//        System.out.println();
//
//        IntStream intStream1 = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
//        intStream1.distinct().forEach(System.out::println); // 123456
//        System.out.println();
//
//        IntStream intStream2 = IntStream.rangeClosed(1, 10);
//        intStream2.filter(i -> i % 2 == 0).forEach(System.out::println); //246810
//        System.out.println();
//
//        IntStream intStream3 = IntStream.rangeClosed(1, 10);
//        intStream3.filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::println); // 157
//        System.out.println();
//        IntStream intStream4 = IntStream.rangeClosed(1, 10);
//        intStream4.filter(i -> i % 2 != 0).filter(i -> i % 3 != 0).forEach(System.out::println); // 157
//        System.out.println();
    }
}
